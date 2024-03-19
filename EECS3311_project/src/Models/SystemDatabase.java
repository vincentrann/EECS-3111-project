package Models;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.*;


public class SystemDatabase {

	private String clientCSV= "src\\data\\Clients.csv";
	private String physicalCSV = "src\\data\\PhysicalItems.csv";
	private String virtualCSV = "src\\data\\VirtualItems.csv";
	private String facultyCSV = "src\\data\\FacultyData.csv";
	private String studentCSV = "src\\data\\StudentData.csv";
	private String clientItemsCSV = "src\\data\\userItems.csv";
	private String newsletterCSV = "src\\data\\NewsletterItems.csv";
	private String newsletterSubscriberCSV = "src\\data\\NewsletterSubscriber.csv";
	private String FacultyTextbooks = "src\\data\\FacultyTextbooks.csv";
	private String FacultyCourse = "src\\data\\FacultyCourse.csv";

	private static SystemDatabase instance;

	
	public static SystemDatabase getInstance() {
		if(instance == null){
			instance = new SystemDatabase();
		}
		return instance;
	}
	
	private SystemDatabase() {}
	
	public boolean clientExists(String email, String type) {
		try {
			CsvReader clientReader = new CsvReader(clientCSV);
			clientReader.readHeaders();
			while (clientReader.readRecord()) {
				String emailString = clientReader.get(0);
				String typeString = clientReader.get(2);
				
				if(emailString.equals(email) && typeString.equals(type)) {
					clientReader.close();
					return true;
				}
			}
			clientReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean clientLogin(String email, String password) {
		try {
			CsvReader clientReader = new CsvReader(clientCSV);
			clientReader.readHeaders();
			while (clientReader.readRecord()) {
				String emailString = clientReader.get(0);
				String passwordString = clientReader.get(1);
				
				if(emailString.equals(email) && passwordString.equals(password)) {
					clientReader.close();
					return true;
				}
			}
			clientReader.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public void addClient(Client client) {
		String type = client.getType();
		String email = client.getEmail();
		String password = client.getPassword();
		String id = client.getUserID();
		
		
		try {
			CsvWriter clientWriter = new CsvWriter(new FileWriter(newsletterCSV, true), ',');
			clientWriter.write(email);
			clientWriter.write(password);
			clientWriter.write(type);
			clientWriter.write(id);
			
			clientWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void addNewsletter(Newsletter newsletter) {
		String name = newsletter.getName();
	    String url = newsletter.getUrl();
	    
	    try {
			CsvWriter clientWriter = new CsvWriter(new FileWriter(clientCSV, true), ',');
			clientWriter.write(name);
			clientWriter.write(url);
			
			clientWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public void addSubscription(String userID, Newsletter newsletter) {
	    try (CSVWriter writer = new CSVWriter(new FileWriter(newsletterSubscriberCSV, true))) {
	        String[] data = {newsletter.getName(), userID}; // Assuming 'name' uniquely identifies a newsletter
	        writer.writeNext(data);
	    } catch (IOException e) {
	        System.err.println("An error occurred while writing to the file: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	//TODO: Might need to use this one instead of the one above
	/**
	public void addSubscription(String userID, String name) {


        try (CSVWriter writer = new CSVWriter(new FileWriter(newsletterSubscriberCSV, true))) {
            String[] data = {name, userID};
            writer.writeNext(data);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
	*/
	public void cancelSubscription(String userID, Newsletter newsletter) {
	    String csvFile = newsletterSubscriberCSV;
	    String tempFile = "temp.csv";

	    try (CSVReader reader = new CSVReader(new FileReader(csvFile));
	         CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {

	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            // Skip the line that matches both the newsletter name and the user ID
	            if (nextLine.length >= 2 && nextLine[0].equals(newsletter.getName()) && nextLine[1].equals(userID)) {
	                continue; // Skip this record, effectively deleting it from the list
	            }
	            writer.writeNext(nextLine); // Write other records normally
	        }

	    } catch (IOException e) {
	        System.err.println("An error occurred while removing the subscription: " + e.getMessage());
	        e.printStackTrace();
	        return;
	    }

	    // Replace the old file with the updated one
	    File oldFile = new File(csvFile);
	    File newFile = new File(tempFile);
	    if (!oldFile.delete()) {
	        System.err.println("Could not delete the original file.");
	        return;
	    }
	    if (!newFile.renameTo(oldFile)) {
	        System.err.println("Could not rename the temporary file to the original file.");
	    }
	}

	    
	//TODO: Might need to use this one instead of the one above    
	/**
	public void cancelSubscription(String userID, String name) {
        String csvFile = newsletterSubscriberCSV;
        String tempFile = "temp.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile));
             CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {

                if (nextLine.length >= 2 && nextLine[0].equals(name) && nextLine[1].equals(userID)) {
                    continue;
                }
                writer.writeNext(nextLine);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while removing the subscription: " + e.getMessage());
            e.printStackTrace();
            return;
        }


        File oldFile = new File(csvFile);
        File newFile = new File(tempFile);
        if (!oldFile.delete()) {
            System.err.println("Could not delete the original file.");
            return;
        }
        if (!newFile.renameTo(oldFile)) {
            System.err.println("Could not rename the temporary file to the original file.");
        }
    }
    */
	  
	//Added to use Newsletters instead of strings.
	public List<Newsletter> viewAvailableNewsletters(String userID) {
	    List<Newsletter> subscribedNewsletters = new ArrayList<>();

	    try (CSVReader reader = new CSVReader(new FileReader(newsletterSubscriberCSV))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            if (nextLine.length >= 3 && nextLine[2].equals(userID)) { // Assuming the userID is in the third column
	                String newsletterName = nextLine[0];
	                String newsletterURL = nextLine[1]; // Assuming the URL is in the second column
	                subscribedNewsletters.add(new Newsletter(newsletterName, newsletterURL)); // Now passing both name and URL
	            }
	        }
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the subscriptions: " + e.getMessage());
	        e.printStackTrace();
	    }

	    return subscribedNewsletters;
	}
	//TODO: Might need to use this one instead of the one above  
	/**
	public List<String> viewAvailableNewsletters(String userID) {
        String csvFile = newsletterSubscriberCSV;
        List<String> subscribedNewsletters = new ArrayList<String>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length >= 2 && nextLine[1].equals(userID)) {
                    subscribedNewsletters.add(nextLine[0]);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the subscriptions: " + e.getMessage());
            e.printStackTrace();
        }

        return subscribedNewsletters;
    }
	*/
	
	public double getMonthlyCost(String uniqueID) {
        String csvFile = clientCSV;
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length >= 2 && nextLine[1].equals(uniqueID)) {
                    return Double.parseDouble(nextLine[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
	
	public void addTextbook(String textbook, String email) {
		String csvFile = FacultyTextbooks;
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))) {
            String[] data = {textbook, email};
            writer.writeNext(data);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
		
		
		
	}
	
	public void addCourse(String course, String email) {
		String csvFile = FacultyCourse;
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))) {
            String[] data = {textbook, email};
            writer.writeNext(data);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
		
	}
	
	public void removeCourse(String course, String email) {
		String csvFile = FacultyCourse;
        File tempFile = new File("temp.csv");

        try (CSVReader reader = new CSVReader(new FileReader(csvFile));
             CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (!line[0].equals(course) || !line[1].equals(email)) {
                    writer.writeNext(line);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading/writing the file: " + e.getMessage());
            e.printStackTrace();
        }

        if (!tempFile.renameTo(new File(csvFile))) {
            System.err.println("Error occurred while renaming the file.");
        }
	}

	
	public Client getClient (String userID) {
		return null;
	}
	//TODO: needed for OpenVirtualBooks page
	public Item getVirtualItem (String itemID) {
		return null;
	}
	//TODO: needed for RentBook page
	public Item getPhysicalItem (String itemID) {
		return null;
	}
	
	public List<Newsletter> getNewsletterList() {
	    String csvFile = newsletterCSV;
	    List<Newsletter> newsletters = new ArrayList<>();

	    try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            if (nextLine.length >= 2) { 
	                String name = nextLine[0];
	                String link = nextLine[1];
	                Newsletter newsletter = new Newsletter(name, link);
	                newsletters.add(newsletter);
	            }
	        }
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the newsletters: " + e.getMessage());
	        e.printStackTrace();
	    }

	    return newsletters;
	}

}

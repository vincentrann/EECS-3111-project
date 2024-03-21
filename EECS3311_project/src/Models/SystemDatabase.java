package Models;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.*;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;


import FlyweightPattern.*;




public class SystemDatabase {

	private String clientCSV= "src\\data\\Clients.csv";
	private String physicalCSV = "src\\data\\PhysicalItems.csv";
	private String virtualCSV = "src\\data\\VirtualItems.csv";
	private String facultyCSV = "src\\data\\FacultyData.csv";
	private String studentCSV = "src\\data\\StudentData.csv";
	private String clientItemsCSV = "src\\data\\userItems.csv";
	private String newsletterCSV = "src\\data\\NewsletterItems.csv";
	private String newsletterSubscriberCSV = "src\\data\\NewsletterSubscriber.csv";
	private String FacultyTextbooksCSV = "src\\data\\FacultyTextbooks.csv";
	private String FacultyCourseCSV = "src\\data\\FacultyCourse.csv";
	private String BookRequestsCSV = "src\\data\\BookRequests.csv";

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
			CsvWriter clientWriter = new CsvWriter(new FileWriter(clientCSV, true), ',');
			clientWriter.write(email);
			clientWriter.write(password);
			clientWriter.write(type);
			clientWriter.write(id);
			
			clientWriter.endRecord();
			
			clientWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void addNewsletter(Newsletter newsletter) {
		String name = newsletter.getName();
	    String url = newsletter.getUrl();
	    
	    try {
			CsvWriter clientWriter = new CsvWriter(new FileWriter(newsletterCSV, true), ',');
			clientWriter.write(name);
			clientWriter.write(url);
			
			clientWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public Client getClient (String email) {
		try {
			CsvReader clientReader = new CsvReader(clientCSV);
			clientReader.readHeaders();
			while (clientReader.readRecord()) {
				if (email.equals(clientReader.get(0))) {
					String typeString = clientReader.get(2);
					String passwordString = clientReader.get(1);
					String userIDString = clientReader.get(3);
					clientReader.close();
					Client client = new Client(typeString, email, passwordString, userIDString);
					
					CsvReader userItemsReader = new CsvReader(clientItemsCSV);
					userItemsReader.readHeaders();
					// adds user's items
					while (userItemsReader.readRecord()) {
						String userEmail = userItemsReader.get(0);
						if(userEmail.equals(email)) {
							String itemString = userItemsReader.get(1);
							String dueString = userItemsReader.get(2);
							dueString = dueString.substring(1, dueString.length()-1).replace("\"\"", "\"");
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
							LocalDateTime dateTime = LocalDateTime.parse(dueString, formatter);
							
							client.addRentedItem(itemString, dateTime);
						}
					}
					userItemsReader.close();
					
					//adds user's newsletters
					CsvReader userNewsLetterReader = new CsvReader(newsletterSubscriberCSV);
					userNewsLetterReader.readHeaders();
					while (userNewsLetterReader.readRecord()) {
						String subscriber = userNewsLetterReader.get(1);
						if (subscriber.equals(email)) {
							String newsLetter = userNewsLetterReader.get(0);
							String newsLink = userNewsLetterReader.get(2);
							
	
							Newsletter news = NewsletterFactory.getNewsletter(newsLetter, newsLink);
							client.addSubsciption(news);
						}
						
					}
					userNewsLetterReader.close();
					
					
					return client;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	//TODO: needed for OpenVirtualBooks page
	public Item getVirtualItem (String name) {
		try {
			CsvReader virtualReader = new CsvReader(virtualCSV);
			virtualReader.readHeaders();
			while (virtualReader.readRecord()) {
				String nameString = virtualReader.get(0);
				if (name.equals(nameString)) {
					String text = virtualReader.get(1);
					String editionString = virtualReader.get(2);
					Boolean availbilityString = Boolean.parseBoolean(virtualReader.get(3));
					
					VirtualItem item = VirtualItemFactory.getVirtualBook(nameString, editionString, availbilityString);
					item.addText(text);
					virtualReader.close();
					return item;
				}
			}
			virtualReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//for change book status/availability
	public void updateVirtualItemAvailability(String name, boolean availability) {
	    String tempFile = "temp.csv"; // Temporary file to write updated data

	    try (CSVReader virtualReader = new CSVReader(new FileReader(virtualCSV));
	         CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {

	        String[] nextLine;
	        while ((nextLine = virtualReader.readNext()) != null) {
	            String nameString = nextLine[0];
	            if (name.equals(nameString)) {
	                // Update the availability
	                nextLine[3] = String.valueOf(availability);
	            }
	            // Write the line to the temporary file
	            writer.writeNext(nextLine);
	        }

	    } catch (IOException | CsvValidationException e) {
	        e.printStackTrace();
	    }

	    // Rename the temporary file to the original file
	    File originalFile = new File(virtualCSV);
	    File temp = new File(tempFile);
	    temp.renameTo(originalFile);
	}
	
	public String getVirtualTextbookName(String studentEmail) {
	    try {
	        CsvReader virtualReader = new CsvReader(virtualCSV);
	        virtualReader.readHeaders();
	        while (virtualReader.readRecord()) {
	            String email = virtualReader.get(0);
	            String textbookName = virtualReader.get(2); // Assuming the virtual textbook name is at index 2
	            if (studentEmail.equals(email)) {
	                virtualReader.close();
	                return textbookName;
	            }
	        }
	        virtualReader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	
	//TODO: needed for RentBook page
	public Item getPhysicalItem (String name) {
		try {
			CsvReader physicalReader = new CsvReader(physicalCSV);
			physicalReader.readHeaders();
			while(physicalReader.readRecord()) {
				String nameString = physicalReader.get(0);
				String id = physicalReader.get(1);
				if(nameString.equals(name)) {
					Boolean statusString = Boolean.parseBoolean(physicalReader.get(4));
					String locationString = physicalReader.get(3);
					int copiesString = Integer.parseInt(physicalReader.get(2));
					
					physicalReader.close();
					return PhysicalItemFactory.getPhysicalItem(nameString, id, copiesString, locationString, statusString);
				}
			}
			physicalReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// call within "rentPhysicalItem"
	public void rentItem(PhysicalItem item, LocalDateTime dueDateTime, Client client) {
		try { 
			CsvReader physicalReader = new CsvReader(physicalCSV);
			CsvWriter physicalWriter = new CsvWriter(physicalCSV);
			CsvWriter userItemWriter = new CsvWriter(new FileWriter(clientItemsCSV, true), ',');
			List<String[]> rows = new ArrayList<>();
			
			while(physicalReader.readRecord()) {
				String[] columns = physicalReader.getValues();
				if (item.getName().equals(physicalReader.get(0))) {
					int number = item.getCopies();
					
					columns[2] = Integer.toString(number);
					rows.add(columns);
				}
				else {
					rows.add(columns);
				}
			}
			for (String[] row: rows) {
				physicalWriter.writeRecord(row);
			}
			physicalReader.close();
			physicalWriter.close();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String dateFormat = "\"" + dueDateTime.format(formatter).replace("\"", "\"\"") + "\"";

			userItemWriter.write(client.getEmail());
			userItemWriter.write(item.getName()); 
			userItemWriter.write(dateFormat);
			userItemWriter.endRecord();
			
			userItemWriter.close();
			client.setRentCount();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean rentStatus(Client client) {
		int overdue = 0;	
		if (client.getRentCount() >= 10) {
			return false;
		}
		try {
			CsvReader userItemsReader = new CsvReader(clientItemsCSV);
			userItemsReader.readHeaders();
			while (userItemsReader.readRecord()) {
				if(userItemsReader.get(0).equals(client.getEmail())) {
					String dueString = userItemsReader.get(2);
					dueString = dueString.substring(1, dueString.length()-1).replace("\"\"", "\"");
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					LocalDateTime dateTime = LocalDateTime.parse(dueString, formatter);
					LocalDateTime currentDate = LocalDateTime.now(); 
					if (currentDate.compareTo(dateTime) > 0) {
						overdue ++;
					}
				}
			}
			if (overdue > 3) {
				return false;
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		return true;
	}
	
	//for change book status/availability
	public void updatePhysicalItemAvailability(String name, boolean availability) {
	    String tempFile = "temp.csv"; // Temporary file to write updated data

	    try (CSVReader physicalReader = new CSVReader(new FileReader(physicalCSV));
	         CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {

	        String[] nextLine;
	        while ((nextLine = physicalReader.readNext()) != null) {
	            String nameString = nextLine[0];
	            if (nameString.equals(name)) {
	                // Update the availability
	                nextLine[4] = String.valueOf(availability);
	            }
	            // Write the line to the temporary file
	            writer.writeNext(nextLine);
	        }

	    } catch (IOException | CsvValidationException e) {
	        e.printStackTrace();
	    }

	    // Rename the temporary file to the original file
	    File originalFile = new File(physicalCSV);
	    File temp = new File(tempFile);
	    temp.renameTo(originalFile);
	}

	public void addSubscription(String userID, Newsletter newsletter) {
        try {
            CsvWriter writer = new CsvWriter(new FileWriter(newsletterSubscriberCSV, true), ',');
            writer.write(userID);
            writer.write(newsletter.getName());
            writer.write(newsletter.getUrl());
            writer.endRecord();
            writer.close();
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
	 * @throws CsvValidationException 
	*/
	public void cancelSubscription(String userID, Newsletter newsletter) throws CsvValidationException {
	    String csvFile = newsletterSubscriberCSV;
	    String tempFile = "temp.csv";

	    try (CSVReader reader = new CSVReader(new FileReader(csvFile));
	         CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {

	        String[] nextLine;
	        try {
				while ((nextLine = reader.readNext()) != null) {
				    // Skip the line that matches both the newsletter name and the user ID
				    if (nextLine.length >= 2 && nextLine[1].equals(newsletter.getName()) && nextLine[0].equals(userID)) {
				        continue; // Skip this record, effectively deleting it from the list
				    }
				    writer.writeNext(nextLine); // Write other records normally
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	 * @throws CsvValidationException 
    */
	  
	//Added to use Newsletters instead of strings.
	public List<Newsletter> viewAvailableNewsletters(String userID) throws CsvValidationException {
	    List<Newsletter> subscribedNewsletters = new ArrayList<>();

	    try (CSVReader reader = new CSVReader(new FileReader(newsletterSubscriberCSV))) {
	        String[] nextLine;
	        try {
				while ((nextLine = reader.readNext()) != null) {
				    if (nextLine.length >= 3 && nextLine[0].equals(userID)) { // Assuming the userID is in the third column
				        String newsletterName = nextLine[1];
				        String newsletterURL = nextLine[2]; // Assuming the URL is in the second column
				        subscribedNewsletters.add(new Newsletter(newsletterName, newsletterURL)); // Now passing both name and URL
				    }
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	 * @throws NumberFormatException 
	 * @throws CsvValidationException 
	*/
	
	public double getMonthlyCost(String uniqueID) throws CsvValidationException, NumberFormatException {
        String csvFile = clientCSV;
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            try {
				while ((nextLine = reader.readNext()) != null) {
				    if (nextLine.length >= 2 && nextLine[1].equals(uniqueID)) {
				        return Double.parseDouble(nextLine[3]);
				    }
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
	
	public void addTextbook(String textbook, String email) {
		String csvFile = FacultyTextbooksCSV;
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))) {
            String[] data = {textbook, email};
            writer.writeNext(data);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
		
		
		
	}
	
	public void addCourse(String course, String email) {
		String csvFile = FacultyCourseCSV;
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))) {
            String[] data = {course, email};
            writer.writeNext(data);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
		
	}
	
	public void removeCourse(String course, String email) throws CsvValidationException {
		String csvFile = FacultyCourseCSV;
        File tempFile = new File("src\\data\\" + "temp.csv");

        try (CSVReader reader = new CSVReader(new FileReader(csvFile));
             CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {
            String[] line;
            try {
				while ((line = reader.readNext()) != null) {
				    if (!line[0].equals(course) || !line[1].equals(email)) {
				        writer.writeNext(line);
				    }
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } catch (IOException e) {
            System.err.println("An error occurred while reading/writing the file: " + e.getMessage());
            e.printStackTrace();
        }
        
        File oldFile = new File(csvFile);
	    if (!oldFile.delete()) {
	        System.err.println("Could not delete the original file.");
	        return;
	    }
        if (!tempFile.renameTo(new File(csvFile))) {
            System.err.println("Error occurred while renaming the file.");
        }
	}
	
	//TODO: 
		public Item getNewsletter (String name) {
			return null;
		}
	
	
	
	/*THESE ARE THE TODOS IMPLEMENTED JUST NOT COMPLETELY AS IT NEEDS TO RETURN THE ACTUAL ITEM*/
	
	/*
	
	public VirtualTextbook getVirtualItem(String name) {
		
		String csvFile = virtualCSV;
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            if (nextLine[0].equals(name)) {
	            	return new VirtualTextbook(nextLine[0], nextLine[1]); //this should create a virtual item and return it
	            }
	        }
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the virtualItems: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	*/
	/*
	
	public PhysicalItem getPhysicalItem(String name) {
		
		String csvFile = physicalCSV;
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            if (nextLine[0].equals(name)) {
	            	return new Physicalitem(nextLine[0], nextLine[1]); //this should create a physical item and return it
	            }
	        }
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the virtualItems: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	*/
	/*
	
	public PhysicalItem getNewsletter(String name) {
		
		String csvFile = physicalCSV;
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            if (nextLine[0].equals(name)) {
	            	return new Newsletter(nextLine[0], nextLine[1]); //this should create a physical item and return it
	            }
	        }
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the virtualItems: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	*/
	
	
	public List<Newsletter> getNewsletterList() throws CsvValidationException {
	    String csvFile = newsletterCSV;
	    List<Newsletter> newsletters = new ArrayList<>();

	    try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        try {
				while ((nextLine = reader.readNext()) != null) {
				    if (nextLine.length >= 2) { 
				        String name = nextLine[0];
				        String link = nextLine[1];
				        Newsletter newsletter = new Newsletter(name, link);
				        newsletters.add(newsletter);
				    }
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the newsletters: " + e.getMessage());
	        e.printStackTrace();
	    }

	    return newsletters;
	}

	/*
	 * Return list of book titles that are similar to given
	 */
	public ArrayList<String> recommend(String bookTitle) throws CsvValidationException {
	    ArrayList<String> similarTitles = new ArrayList<>();

	    try (CSVReader reader = new CSVReader(new FileReader(physicalCSV))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	        	String title = nextLine[0];

	        	String similar1 = areSimilar(title);
	        	String similar2 = areSimilar(bookTitle);

	        	if (similar1.equals(similar2)) {
	        		similarTitles.add(title);
	        	}
	        	
	        }
	        
	        similarTitles.remove(bookTitle);
	    } catch (IOException e) {
	        System.err.println("An error occurred while reading the subscriptions: " + e.getMessage());
	        e.printStackTrace();
	    }

	    return similarTitles;
	    
	}
	
	
	/*
	 * Gets the book similarity based on book title
	 */
	private String areSimilar(String title) {
	   StringBuilder sb = new StringBuilder();
           for (char c : title.toCharArray()) {
              if (Character.isDigit(c)) {
                 break;
              }
              sb.append(c);
           }
           return sb.toString();
	}
	
	public void addBookRequest(String name, String type, String priority) throws IOException {
		String csvFile = BookRequestsCSV;
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))){
			String[] data = {name, type, priority};
            writer.writeNext(data);
			
		}
		catch (IOException e) {
            System.err.println("An error occurred while reading/writing the file: " + e.getMessage());
            e.printStackTrace();
        }
	}
	
	public ArrayList<String> getCourses(String name) throws FileNotFoundException, IOException, CsvValidationException{
		String csvFile = FacultyCourseCSV;
		ArrayList<String> teacherCourses = new ArrayList<String>();
		
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))){
			String[] nextLine;
			while((nextLine = reader.readNext()) != null) {
				String Course =  nextLine[0];
				String Teacher = nextLine[1];
				
				if(name.equals(Teacher)) {
					teacherCourses.add(Course);
				}
			}
		} catch (IOException e) {
	        System.err.println("An error occurred while reading the Courses: " + e.getMessage());
	        e.printStackTrace();
	    }
		
		return teacherCourses;

	}
	
	public ArrayList<String> getTextbooks(String name) throws FileNotFoundException, IOException, CsvValidationException{
		String csvFile = FacultyTextbooksCSV;
		ArrayList<String> teacherTextbooks = new ArrayList<String>();
		
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))){
			String[] nextLine;
			while((nextLine = reader.readNext()) != null) {
				String Textbook =  nextLine[0];
				String Teacher = nextLine[1];
				
				if(name.equals(Teacher)) {
					teacherTextbooks.add(Textbook);
				}
			}
		} catch (IOException e) {
	        System.err.println("An error occurred while reading the Courses: " + e.getMessage());
	        e.printStackTrace();
	    }
		
		return teacherTextbooks;

	}

	
	public ArrayList<TextbookInfo> getTextbooksAndEdition(String name) throws FileNotFoundException, IOException, CsvValidationException{
	        String csvFile = FacultyTextbooksCSV;
	        ArrayList<TextbookInfo> teacherTextbooks = new ArrayList<>();

	        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	            String[] nextLine;
	            while ((nextLine = reader.readNext()) != null) {
	                String textbook = nextLine[0];
	                String teacher = nextLine[1];
	                String edition = nextLine[2];//DEPENDING ON WHAT COLUMN THE EDITION IS IN

	                if (name.equals(teacher)) {
	                    TextbookInfo textbookInfo = new TextbookInfo(textbook, edition);
	                    teacherTextbooks.add(textbookInfo);
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("An error occurred while reading the Courses: " + e.getMessage());
	            e.printStackTrace();
	        }

	        return teacherTextbooks;
	    }
	
	public ArrayList<TextbookInfo> getAllTextbooksAndEdtition() throws CsvValidationException{
		 String csvFile = FacultyTextbooksCSV;
	        ArrayList<TextbookInfo> teacherTextbooks = new ArrayList<>();

	        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	            String[] nextLine;
	            while ((nextLine = reader.readNext()) != null) {
	                String textbook = nextLine[0];
	                String teacher = nextLine[1];
	                String edition = nextLine[2];//DEPENDING ON WHAT COLUMN THE EDITION IS IN

	                    TextbookInfo textbookInfo = new TextbookInfo(textbook, edition);
	                    teacherTextbooks.add(textbookInfo);
	            }
	        } catch (IOException e) {
	            System.err.println("An error occurred while reading the Courses: " + e.getMessage());
	            e.printStackTrace();
	        }

	        return teacherTextbooks;
		
	}

	public void addPhysicalItem(String name, String aisle) throws FileNotFoundException, IOException, CsvValidationException {
		String csvFile = physicalCSV;
		int id = 0;
		
		try(CSVReader reader = new CSVReader(new FileReader(csvFile))){
			String[] nextLine;
			nextLine = reader.readNext();
			while((nextLine = reader.readNext()) != null){
				id = Integer.parseInt(nextLine[1]) + 1;			
			}
		}
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))){
			String[] data = {name, String.valueOf(id), "20", aisle, "TRUE"};
			writer.writeNext(data);
		}
		
	}

	public void addVirtualItem(String name, String edition, String text) throws FileNotFoundException, IOException, CsvValidationException {
		String csvFile = virtualCSV;
		int id = 10000;
		
		try(CSVReader reader = new CSVReader(new FileReader(csvFile))){
			String[] nextLine;
			nextLine = reader.readNext();
			while((nextLine = reader.readNext()) != null){
				id = Integer.parseInt(nextLine[1]) + 1;			
			}
		}
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))){
			String[] data = {name, String.valueOf(id), edition, text, "TRUE"};
			writer.writeNext(data);
		}
	}

}

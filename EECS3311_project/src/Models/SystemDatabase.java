package Models;
import java.io.FileWriter;
import javax.swing.JOptionPane;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	private String unverifiedEmailsCSV = "src\\data\\UnverifiedEmails.csv";
	
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
	
	public void updateVirtualItemAvailability(String name, String availability) {
	    String csvFile = virtualCSV;
	    List<String[]> linesToUpdate = new ArrayList<>();
	    boolean found = false;
	    
	    try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        // Read the file line by line
	        while ((nextLine = reader.readNext()) != null) {
	            // Check if the line contains the specified name
	            if (nextLine.length > 0 && nextLine[0].equals(name)) {
	                // Update the availability for the matched item
	                nextLine[3] = availability; // Assuming availability is in the 4th column (index 3)
	                found = true;
	            }
	            // Add the line to the list
	            linesToUpdate.add(nextLine);
	        }
	    } catch (IOException | CsvValidationException e) {
	        e.printStackTrace();
	        return;
	    }
	    if (!found) {
	        JOptionPane.showMessageDialog(null, "Item not found.");
	        return;
	    }
	    
	    else {
	        JOptionPane.showMessageDialog(null, "Status changed to: " + availability);
	    }
	    // Write the updated data back to the file
	    try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
	        writer.writeAll(linesToUpdate);
	        System.out.println("Item availability updated successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
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
	
	public void updatePhysicalItemAvailability(String name, String availability) {
	    String csvFile = physicalCSV;
	    List<String[]> linesToUpdate = new ArrayList<>();
	    boolean found = false;
	    try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        // Read the file line by line
	        while ((nextLine = reader.readNext()) != null) {
	            // Check if the line contains the specified name
	            if (nextLine.length > 0 && nextLine[0].equals(name)) {
	                // Update the availability for the matched item
	                nextLine[4] = availability; // Assuming availability is in the 5th column (index 4)
	                found = true;
	            }
	            // Add the line to the list
	            linesToUpdate.add(nextLine);
	        }
	    } catch (IOException | CsvValidationException e) {
	        e.printStackTrace();
	        return;
	    }
	    if (!found) {
	        JOptionPane.showMessageDialog(null, "Item not found.");
	        return;
	    }
	    
	    else {
            JOptionPane.showMessageDialog(null, "Status changed to:" + availability);
	    }
	    // Write the updated data back to the file
	    try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
	        writer.writeAll(linesToUpdate);
	        System.out.println("Item availability updated successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
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
	                
	                String[] info = textbook.split(" ");
	                if (name.equals(teacher) && info.length == 2) {
	                    TextbookInfo textbookInfo = new TextbookInfo(info[0], Integer.parseInt(info[1]));
	                    System.out.println(textbookInfo.getEdition());
	                    System.out.println(textbookInfo.getTextbook());
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
		 String csvFile = virtualCSV;
	        ArrayList<TextbookInfo> teacherTextbooks = new ArrayList<>();
	        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	            String[] nextLine;
	            reader.readNext();
	            while ((nextLine = reader.readNext()) != null) {
	                String textbook = nextLine[0];
	                int edition = Integer.parseInt(nextLine[2]);//DEPENDING ON WHAT COLUMN THE EDITION IS IN
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
		try(CSVReader reader = new CSVReader(new FileReader(csvFile))){
			String[] nextLine;
			nextLine = reader.readNext();
			while((nextLine = reader.readNext()) != null){
			}
		}
		
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))){
			String[] data = {name, text, edition, "TRUE"};
			writer.writeNext(data);
		}
	}
	
	
	//returns student's course assigned book
	public String getVirtualItemTextbook(String email) {
        String csvFile = studentCSV;
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            // Read the file line by line
            while ((nextLine = reader.readNext()) != null) {
                // Check if the line contains the specified email
                if (nextLine.length > 2 && nextLine[0].equals(email)) {
                    // If the email is found, return the value from the third column (virtualTextbook)
                    return nextLine[2];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch(CsvValidationException ee) {
            ee.printStackTrace();
        }
        // If the email is not found or an error occurs, return null
        return null;
    }
	
	//returns student's course assigned book expiry date
	public String getVirtualTextbookExpiry(String email) {
	    String csvFile = studentCSV;
	    try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        String[] nextLine;
	        // Read the file line by line
	        while ((nextLine = reader.readNext()) != null) {
	            // Check if the line contains the specified email
	            if (nextLine[0].equals(email)) {
	            	return nextLine[3].replace("\"", ""); // Remove quotation marks
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (CsvValidationException ee) {
	        ee.printStackTrace();
	    }
	    // If the email is not found or an error occurs, return null
	    return null;
	}
	
	public String getVirtualItemText(String targetName) {
        String csvFile = "src\\data\\VirtualItems.csv";
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            // Read the file line by line
            while ((nextLine = reader.readNext()) != null) {
                // Check if the line contains the specified targetName
                if (nextLine.length > 1 && nextLine[0].equals(targetName)) {
                    // If the targetName is found, return the value from the second column (text)
                    return nextLine[1];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch(CsvValidationException ee) {
            ee.printStackTrace();
        }
        // If the targetName is not found or an error occurs, return null
        return null;
    }
	
	public void addUnverifiedEmail(String email) {	    
	    try {
	        // First, read the CSV file to find the first empty row
	        CSVReader reader = new CSVReader(new FileReader(unverifiedEmailsCSV));
	        String[] nextLine;
	        int emptyRowIndex = -1; // Index of the first empty row
	        
	        while ((nextLine = reader.readNext()) != null) {
	            emptyRowIndex++;
	            if (nextLine.length == 0 || nextLine[0].isEmpty()) {
	                // Found an empty row, break the loop
	                break;
	            }
	        }
	        
	        // Close the reader
	        reader.close();
	        
	        // Open the writer in append mode
	        CSVWriter writer = new CSVWriter(new FileWriter(unverifiedEmailsCSV, true));
	        
	        // Write the email to the first empty row
	        String[] newRow = new String[1];
	        newRow[0] = email;
	        writer.writeNext(newRow);
	        
	        // Close the writer
	        writer.close();
	        
	        System.out.println("Email added to unverified list.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (CsvValidationException ee) {
	    	ee.printStackTrace();
	    }
	    
	}
	
    public void removeAllUnverifiedEmails() {
        try {
            // Open the CSV reader to count the number of entries
            CSVReader reader = new CSVReader(new FileReader(unverifiedEmailsCSV));
            int numEntries = 0;
            while (reader.readNext() != null) {
                numEntries++;
            }
            reader.close();
            // Open the CSV writer in write mode
            CSVWriter writer = new CSVWriter(new FileWriter(unverifiedEmailsCSV, false));
            // Write empty strings for each entry to clear the first column
            for (int i = 0; i < numEntries; i++) {
                writer.writeNext(new String[]{""});
            }
            // Close the writer
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException ee) {
	    	ee.printStackTrace();
	    }
    }
	
	public List<String> getAllUnverifiedEmails() {
	    List<String> emails = new ArrayList<>();
	    try (CSVReader reader = new CSVReader(new FileReader(unverifiedEmailsCSV))) {
	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            // Assuming email is in the first column (index 0)
	            if (nextLine.length > 0 && !nextLine[0].isEmpty()) {
	                emails.add(nextLine[0]);
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (CsvValidationException ee) {
	    	ee.printStackTrace();
	    }
	    return emails;
	}
}
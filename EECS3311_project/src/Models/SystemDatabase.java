package Models;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.csvreader.*;


public class SystemDatabase {
	private String clientCSV= "src\\data\\Clients.csv";
	private String physicalCSV = "src\\data\\PhysicalItems.csv";
	private String virtualCSV = "src\\data\\VirtualItems.csv";
	private String facultyCSV = "src\\data\\FacultyData.csv";
	private String studentCSV = "src\\data\\StudentData.csv";
	private String clientItemsCSV = "src\\data\\userItems.csv";
	private String newsletterCSV = "src\\data\\NewsletterItems.csv";
	
	public SystemDatabase() {}
	
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
			
			clientWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Client getClient (String userID) {
		return null;
	}
	
	public Item getVirtualItem (String itemID) {
		return null;
	}
	
	public Item getPhysicalItem (String itemID) {
		return null;
	}
	
	public ArrayList<Newsletter> getNewsletterList () {
		return null;
	}
}

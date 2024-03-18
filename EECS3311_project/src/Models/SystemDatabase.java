package Models;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class SystemDatabase {
	private ArrayList<Client> registeredClients;
	private ArrayList<Item> libraryItems;
	private static SystemDatabase instance;
	
	public static SystemDatabase getInstance() {
		if(instance == null){
			instance = new SystemDatabase();
		}
		return instance;
	}
	
	private SystemDatabase() {}
	
	public void addClient(Client client) {
		
	}
	
	public void addItem (Item item) {
		
	}
	
	public void addNewsLetter(String name, String uniqueId, double discount, int monthlyCost) {
		String data = String.format("%s,%s,%.2f,%d%n", name, uniqueId, discount, monthlyCost);

        try (FileWriter writer = new FileWriter("newsletter.csv", true)) {
            writer.write(data);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
		
	}
	
	public Client getClient (String userID) {
		return null;
	}
	
	public Item getItem (String itemID) {
		return null;
	}
}

package Models;

import java.util.ArrayList;

public class SystemDatabase {
	private ArrayList<Client> registeredClients;
	private ArrayList<Item> libraryItems;
	private static SystemDatabase instance;
	
	public SystemDatabase getInstance() {
		if(instance == null){
			this.instance = new SystemDatabase();
		}
		return this.instance;
	}
	
	public SystemDatabase() {}
	
	public void addClient(Client client) {
		
	}
	
	public void addItem (Item item) {
		
	}
	
	public Client getClient (String userID) {
		return null;
	}
	
	public Item getItem (String itemID) {
		return null;
	}
}

package SingletonPattern;

import Models.Client;
import Models.Item;
import Models.SystemDatabase;

public class SingleDBObject {
	private static SystemDatabase instance;
	
	public static SingleDBObject getInstance() {
		if (instance == null) {
			instance = new SystemDatabase();
		}
		return instance;
	}
	public void addClient(Client client) {
		database.addClient(client);
	}
	
	public void addItem (Item item) {
		database.addItem(item);
	}
	
	public Client getClient (String userID) {
		return database.getClient(userID);
	}
	
	public Item getItem (String itemID) {
		return database.getItem(itemID);
	}
	
}

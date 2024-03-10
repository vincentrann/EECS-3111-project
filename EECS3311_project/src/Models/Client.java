package Models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Client implements ObserverPattern.PhysicalItemObserver{
	private String type;
	private String email;
	private String password;
	private String userID;
	private Map<String, LocalDateTime> rentedPhysicalItems = new HashMap<>(); // Stores all physical Items rented
	
	public Client(String type, String email, String password, String userID) {
		this.type = type;
		this.email = email;
		this.password = password;
		this.userID = userID;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	/*
	 * Updates physical item status for client
	 */
	@Override
	public void update(String bookTitle, LocalDateTime dueDate) {
		if (dueDate != null) {
            rentedPhysicalItems.put(bookTitle, dueDate);
        } else {
            rentedPhysicalItems.remove(bookTitle);
        }
	}
	
	/*
	 * Prints list of rented physical items for client
	 */
	public void displayRentedBooks() {
		System.out.println("Currently rented books:");
		for (Map.Entry<String, LocalDateTime> entry : rentedPhysicalItems.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Due Date: " + entry.getValue());
        }
		
	}
	
	/*
	 * Prints the client type with credentials
	 */
	@Override
	public String toString() {
		return "Client{" + "type=" + type + '\\' + "email=" + email + '\\' + "password=" + password + '\\' + "userID=" + userID + "}";
	}
	
	
	// Add additional Functionality
}
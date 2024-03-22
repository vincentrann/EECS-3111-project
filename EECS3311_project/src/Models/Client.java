package Models;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.exceptions.CsvValidationException;

public class Client implements ObserverPattern.PhysicalItemObserver{
	private String type;
	private String email;
	private String password;
	private String userID;
	private int rentCount;
	private Map<String, LocalDateTime> rentedPhysicalItems = new HashMap<>(); // Stores all physical Items rented
	
	private ArrayList<Newsletter> subscribtions = new ArrayList<Newsletter>();
	
	public Client(String type, String email, String password, String userID) {
		this.type = type;
		this.email = email;
		this.password = password;
		this.userID = userID;
		this.rentCount = 0;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUserID(){
		return userID;
	}
	
	public String getType() {
		return this.type;
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
	
	public void setRentCount () {
		this.rentCount++;
	}
	
	public int getRentCount() {
		return this.rentCount;
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
	
	public void addRentedItem(String name, LocalDateTime dueDate) {
		rentedPhysicalItems.put(name, dueDate);
		this.setRentCount();
	}
	
	public void addSubsciption(Newsletter newsletter) {
		SystemDatabase.getInstance().addSubscription(userID, newsletter);
	}
	/*
	 *  Added: list of rented physical items for client
	 */
	public Map<String, LocalDateTime> displayRentedBooks() {
		return rentedPhysicalItems;
	}
	
	/*
	 *  Added: returns a list of notifications for overdue books.
	 */
	public List<String> notifyDueDate() {
	    List<String> dueDateNotifications = new ArrayList<>();
	    LocalDateTime now = LocalDateTime.now();
	    for (Map.Entry<String, LocalDateTime> entry : rentedPhysicalItems.entrySet()) {
	        LocalDateTime dueDateTime = entry.getValue();
	        Duration duration = Duration.between(now, dueDateTime);
	        long hoursLeft = duration.toHours();
	        if ((hoursLeft <= 24) && (hoursLeft >= 0)) {
	            dueDateNotifications.add("Warning: \nLess than 24hrs left\nuntil the due date for item " + entry.getKey());
	        } else if (duration.isNegative()) {
	            dueDateNotifications.add("Warning: \nThe due date for item " + entry.getKey() + " has passed.");
	        }
	    }
	    return dueDateNotifications; 
	}
	
	public void subscribe(Newsletter newsletter) {
		SystemDatabase.getInstance().addSubscription(userID, newsletter);
		subscribtions.add(newsletter);
	}
	
	public void unsubscribe(Newsletter newsletter) throws CsvValidationException {
		SystemDatabase.getInstance().cancelSubscription(userID, newsletter);
		subscribtions.remove(newsletter);
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
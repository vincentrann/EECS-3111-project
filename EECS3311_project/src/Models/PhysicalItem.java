package Models;// package ...

import java.time.Duration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ObserverPattern.*;

public class PhysicalItem{
    private int copies;
    private String locationInLibrary;
    private boolean canBePurchased;
    private List<PhysicalItemObserver> observers; //list of clients borrowing
    private Map<String, LocalDateTime> rentedBooks; //list of rented books

    public PhysicalItem(int copies, String library, boolean canBe){
        this.copies = copies;
        this.locationInLibrary = library;
        this.canBePurchased = canBe;
        this.observers = new ArrayList<>();
        this.rentedBooks = new HashMap<>();
    }

    public String getLocation(){
        return this.locationInLibrary;
    }
    
    /*
     * Adds client to rented list
     */
    public void addObserver(PhysicalItemObserver observer) {
        observers.add(observer);
    }

    /*
     * Removes client from rented list
     */
    public void removeObserver(PhysicalItemObserver observer) {
        observers.remove(observer);
    }
    
    /*
     * Client rents the physical item
     */
    public void rentPhysicalItem(String bookTitle, LocalDateTime dueDateTime, Client client) {
    	if (rentedBooks.size() < copies) {
            rentedBooks.put(bookTitle, dueDateTime);
            addObserver(client);
            notifyObservers(bookTitle, dueDateTime);
            copies--;
        } else {
        	
        	SystemNotification noBooks = new SystemNotification();
            noBooks.unavailableTextbook();
            
            // this is used for now
            System.out.println("Sorry, all copies of the book are already rented.");
        	
            // this can change based on how book procure
        	if (client.getType().equals("FacultyMember")) {
        		ManagementTeam team = new ManagementTeam();
        		team.pocureBook(bookTitle);
        	} 
        	
        }
    }

    /*
     * Client returns the physical item
     */
    public void returnPhysicalItem(String bookTitle, Client client) {
    	if (rentedBooks.containsKey(bookTitle)) {
            rentedBooks.remove(bookTitle);
            notifyObservers(bookTitle, null); // Pass null as due date to indicate book return
            removeObserver(client); // Remove the client from observers
            copies++;
            //notifyObservers(bookTitle, null); // Pass null as due date to indicate book return
        } else {
            System.out.println("The book " + bookTitle + " is not currently rented.");
        }
    }

    /*
     * Prints a message based on due date of the rented physical item
     */
    public void notifyDueDate() {
        LocalDateTime now = LocalDateTime.now();
        for (Map.Entry<String, LocalDateTime> entry : rentedBooks.entrySet()) {
            LocalDateTime dueDateTime = entry.getValue();
            Duration duration = Duration.between(now, dueDateTime);
            long hoursLeft = duration.toHours();
            if ((hoursLeft <= 24) && (hoursLeft >= 0)) {
                System.out.println("Warning: Less than 24hrs left until the due date for book " + entry.getKey());
            } else if (duration.isNegative()) {
                System.out.println("Warning: The due date for book " + entry.getKey() + " has passed.");
            }
        }
    }

    /*
     * Updates the status of rented books for client
     */
    private void notifyObservers(String bookTitle, LocalDateTime dueDate) {
    	notifyDueDate(); // check due date each time some activity happens for client
        for (PhysicalItemObserver observer : observers) {
        	observer.update(bookTitle, dueDate);
        }
    }
}
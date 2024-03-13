package Models;

import java.time.LocalDateTime;



// import packages here
import BuilderPattern.*;
import FlyweightPattern.*;
import ObserverPattern.*;


public class Main {
	public static void main(String[] args) {
		
		// can remove all this later
		/**
		 * How to create clients
		 * - Create client type with credentials
		 * - Create Client and assign client type
		 * 
		 Example:
		 * Student student = new Visitor("someemail@example.com", "somepassword", "someID1");
		 * Client studentClient = student.getClient();
		 */

		// can check validation here for registration before creating client
		String someEmail = "email";
		String somePassword = "123";
		String someID = "ID2";

		Visitor visitor = new Visitor(someEmail, somePassword, someID);
		Client visitorClient = visitor.getClient();
		//System.out.println(visitorClient); //prints details of client
		
		// create items
		PhysicalItem physicalItem = new PhysicalItem(3, "someLibrary1", true); 
		
		
		// client rent physical item
		physicalItem.rentPhysicalItem("IBN123", LocalDateTime.now().plusDays(14), visitorClient);
		physicalItem.rentPhysicalItem("IBN456", LocalDateTime.now().plusDays(1), visitorClient);
		//physicalItem.rentPhysicalItem("book2", LocalDateTime.now().minusDays(2), visitorClient);
		
		//visitorClient.displayRentedBooks(); //prints all rented book for client + due date warning
		physicalItem.returnPhysicalItem("IBN456", visitorClient);
		//visitorClient.displayRentedBooks(); //print all rented book for client + due date warning
		
		
	}

}


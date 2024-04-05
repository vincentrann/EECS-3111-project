package testcases;

import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import Models.SystemDatabase;
import Models.Client;
import Models.PhysicalItem;
import java.time.LocalDateTime;


class SystemDatabaseTest {
	
    @Test
    void testClientExists() throws IOException {
        // Prepare a test CSV file with client data
        String testCSV = "src\\data\\Clients.csv";
 
        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Test client existence
        assertTrue(systemDatabase.clientExists("sir", "Student"), "Client should exist");

        // Test client non-existence
        assertFalse(systemDatabase.clientExists("sirf", "Teacher"), "Client should not exist");

    }

    @Test
    void testClientLogin() throws IOException {
        // Prepare a test CSV file with client data
        String testCSV = "src\\data\\Clients.csv";


        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Test client login with correct credentials
        assertTrue(systemDatabase.clientLogin("sir", "sir"), "Client should be able to login");

        // Test client login with incorrect credentials
        assertFalse(systemDatabase.clientLogin("sir", "sirf"), "Client should not be able to login");

    }
    
    @Test
    void testGetClient() throws IOException {
        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Get the client
        Client client = systemDatabase.getClient("sir");

        // Assert that client is not null
        assertNotNull(client, "Client should not be null");

        // Assert client's details
        assertEquals("sir", client.getEmail(), "Client email should match");
        assertEquals("Student", client.getType(), "Client type should match");
        assertEquals("ba87d7bb-12ac-4c5e-92c6-d93eaa056edf", client.getUserID(), "Client userID should match");

    }
    
    /*@Test
    void testRentItem() throws IOException {
        // Prepare a test CSV file with physical item data
        String testPhysicalCSV = "src\\data\\PhysicalItems.csv";


        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Create a physical item
        
        PhysicalItem examplePI = (PhysicalItem) systemDatabase.getPhysicalItem("rockCD");
        // Rent the item
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(7); // Due date after 7 days
        systemDatabase.rentItem((PhysicalItem) systemDatabase.getPhysicalItem("rockCD"), dueDateTime, systemDatabase.getClient("Marge3"));

        // Assert that the physical item count has decreased
        assertEquals(SystemDatabase.rentStatus("Marge3"), examplePI.getCopies(), "Physical item count should decrease after renting");


    }*/
    
	   @Test
	    void testAddVirtualItem() throws IOException, CsvValidationException {
	        // Prepare a test CSV file
		   final String virtualCSV = "src\\data\\VirtualItems.csv";
		   FileWriter writer = new FileWriter(virtualCSV);
	        writer.close();

	        // Create a SystemDatabase instance
	        SystemDatabase systemDatabase = SystemDatabase.getInstance();

	        // Add a virtual item
	        String itemName = "book1";
	        String edition = "1";
	        String text = "This is a virtual item";
	        systemDatabase.addVirtualItem(itemName, edition, text);

	        // Check if the virtual item was added
	        String retrievedText = systemDatabase.getVirtualItemText(itemName);
	        assertEquals(text, retrievedText, "Text of virtual item should match");

	        // Clean up
	        File file = new File(virtualCSV);
	        file.delete();
	    }

	    @Test
	    void testGetVirtualItemTextbook() {
	        // Prepare a test CSV file with student data
			final String studentCSV = "src\\data\\StudentData.csv";
	        try (FileWriter writer = new FileWriter(studentCSV)) {
	            writer.append("test@example.com, course1, book1, 2024-04-01\n");
	            writer.append("test2@example.com, course2, book2, 2024-05-01\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Create a SystemDatabase instance
	        SystemDatabase systemDatabase = SystemDatabase.getInstance();

	        // Get virtual item textbook for a student
	        String email = "test@example.com";
	        String textbook = systemDatabase.getVirtualItemTextbook(email);

	        // Check if the correct textbook was retrieved
	        assertEquals(" book1", textbook, "Textbook for the student should match");

	        // Clean up
	        File file = new File(studentCSV);
	        file.delete();
	    }

	    @Test
	    void testGetVirtualTextbookExpiry() {
	        // Prepare a test CSV file with student data
			final String studentCSV = "src\\data\\StudentData.csv";
	        try (FileWriter writer = new FileWriter(studentCSV)) {
	            writer.append("test@example.com, course1, book1, 2024-04-01\n");
	            writer.append("test2@example.com, course2, book2, 2024-05-01\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Create a SystemDatabase instance
	        SystemDatabase systemDatabase = SystemDatabase.getInstance();

	        // Get virtual textbook expiry for a student
	        String email = "test@example.com";
	        String expiry = systemDatabase.getVirtualTextbookExpiry(email);

	        // Check if the correct expiry date was retrieved
	        assertEquals(" 2024-04-01", expiry, "Expiry date for the student should match");

	        // Clean up
	        File file = new File(studentCSV);
	        file.delete();
	    }

	    @Test
	    void testGetVirtualItemText() {
	        // Prepare a test CSV file with virtual items data
			final String virtualCSV = "src\\data\\VirtualItems.csv";
	        try (FileWriter writer = new FileWriter(virtualCSV)) {
	            writer.append("book1, This is a virtual item, 1, TRUE\n");
	            writer.append("book2, Another virtual item, 2, TRUE\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Create a SystemDatabase instance
	        SystemDatabase systemDatabase = SystemDatabase.getInstance();

	        // Get virtual item text
	        String itemName = "book1";
	        String text = systemDatabase.getVirtualItemText(itemName);

	        // Check if the correct text was retrieved
	        assertEquals(" This is a virtual item", text, "Text of virtual item should match");

	        // Clean up
	        File file = new File(virtualCSV);
	        file.delete();
	    }

    @Test
    void testAddUnverifiedEmail() throws IOException {
        // Prepare a test CSV file
        String testCSV = "src\\data\\UnverifiedEmails.csv";
        FileWriter writer = new FileWriter(testCSV);
        writer.close();

        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Add an unverified email
        String testEmail = "test@example.com";
        systemDatabase.addUnverifiedEmail(testEmail);

        // Check if the email was added
        List<String> emails = systemDatabase.getAllUnverifiedEmails();
        assertTrue(emails.contains(testEmail), "Email should be added to the unverified list");

        // Clean up
        File file = new File(testCSV);
        file.delete();
    }

    @Test
    void testRemoveAllUnverifiedEmails() throws IOException {
        // Prepare a test CSV file with some entries
        String testCSV = "src\\data\\UnverifiedEmails.csv";
        FileWriter writer = new FileWriter(testCSV);
        writer.append("email1\n");
        writer.append("email2\n");
        writer.close();

        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Remove all unverified emails
        systemDatabase.removeAllUnverifiedEmails();

        // Check if all emails were removed
        List<String> emails = systemDatabase.getAllUnverifiedEmails();
        assertTrue(emails.isEmpty(), "All unverified emails should be removed");

        // Clean up
        File file = new File(testCSV);
        file.delete();
    }

    @Test
    void testGetAllUnverifiedEmails() throws IOException {
        // Prepare a test CSV file with some entries
        String testCSV = "src\\data\\UnverifiedEmails.csv";
        FileWriter writer = new FileWriter(testCSV);
        writer.append("email1\n");
        writer.append("email2\n");
        writer.close();

        // Create a SystemDatabase instance
        SystemDatabase systemDatabase = SystemDatabase.getInstance();

        // Get all unverified emails
        List<String> emails = systemDatabase.getAllUnverifiedEmails();

        // Check if all emails were retrieved
        assertEquals(2, emails.size(), "Number of retrieved emails should match the number of entries");

        // Clean up
        File file = new File(testCSV);
        file.delete();
    }
}

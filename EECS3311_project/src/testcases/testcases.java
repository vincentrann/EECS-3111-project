package testcases;

import static org.junit.jupiter.api.Assertions.*;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.time.LocalDateTime;
import java.util.*;

import org.junit.jupiter.api.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import Bridge_Factory_Pattern.ClientItem;
import Bridge_Factory_Pattern.ConcreteItem;
import Bridge_Factory_Pattern.ConcretePhysicalItem;
import Bridge_Factory_Pattern.ConcreteVirtualTextbook;
import Bridge_Factory_Pattern.ItemFactory;
import BuilderPattern.ClientBuilder;
import BuilderPattern.ClientDirector;
import BuilderPattern.StudentBuilder;
import FlyweightPattern.NewsletterFactory;
import FlyweightPattern.VirtualItemFactory;
import Models.BookRequest;
import Models.Client;
import Models.FacultyMember;
import Models.Item;
import Models.NonFacultyMember;
import Models.PhysicalItem;
import Models.Student;
import Models.SystemDatabase;
import Models.SystemPayment;
import Models.TextbookInfo;
import Models.VirtualItem;
import Models.Visitor;
import appUI.SubscriptionPage;
import Models.Newsletter;

class testcases {
	
	/*Newsletters*/
	
    @Test
    void testNewsletterConstruction() {
        String name = "Test Newsletter";
        String url = "http://example.com";
        
        Newsletter newsletter = new Newsletter(name, url);
        
        assertEquals(name, newsletter.getName(), "Name should match");
        assertEquals(url, newsletter.getUrl(), "URL should match");
    }
    

    @Test
    void testNewsletterCreation() {
        Newsletter newsletter = new Newsletter("Test Newsletter", "http://example.com");
        assertEquals("Test Newsletter", newsletter.getName());
        assertEquals("http://example.com", newsletter.getUrl());
    }

    @Test
    void testAddAndCancelSubscription() {
        Newsletter newsletter = new Newsletter("Test Newsletter", "http://example.com");
        try {
            newsletter.addSubscription("userID", newsletter);
            List<Newsletter> subscriptions = newsletter.viewAvailableNewsletters("userID");
            assertFalse(subscriptions.contains(newsletter));

            newsletter.cancelSubscription("userID", newsletter);
            subscriptions = newsletter.viewAvailableNewsletters("userID");
            assertFalse(subscriptions.contains(newsletter));
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testViewAvailableNewsletters() {
        Newsletter newsletter1 = new Newsletter("Newsletter 1", "http://example.com/1");
        Newsletter newsletter2 = new Newsletter("Newsletter 2", "http://example.com/2");
        List<Newsletter> expectedNewsletters = new ArrayList<>();
        
        expectedNewsletters.add(newsletter1);
        expectedNewsletters.add(newsletter2);
        
        try {
        	Newsletter newsletter = new Newsletter();
        	List<Newsletter> beforeNewsletters = newsletter.viewAvailableNewsletters("userID");
            SystemDatabase.getInstance().addSubscription("userID", newsletter1);
            SystemDatabase.getInstance().addSubscription("userID", newsletter2);
            
            List<Newsletter> availableNewsletters = newsletter.viewAvailableNewsletters("userID");
            assertEquals(beforeNewsletters.size() + expectedNewsletters.size(), availableNewsletters.size());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testGetMonthlyCost() {
        Newsletter newsletter = new Newsletter("Test Newsletter", "http://example.com");
        try {
            double monthlyCost = newsletter.getMonthlyCost("uniqueID");
            assertEquals(-1.0, monthlyCost); 
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    
	/*
	 * Item Management and Notifications
	 */
		
	@Test
	void testTextbooksOfFaculty() throws CsvValidationException, FileNotFoundException, IOException {
		SystemDatabase database = SystemDatabase.getInstance();
		
		ArrayList<String> teacherTextbooks = new ArrayList<String>();
		teacherTextbooks = database.getTextbooks("Prof Smith");
		
		
		ArrayList<String> textbooks = new ArrayList<String>();
		textbooks.add("Chemistry 1");
		textbooks.add("Alchemy 2");
		
		ArrayList<TextbookInfo> textbookEditions = new ArrayList<TextbookInfo>();
		textbookEditions = database.getTextbooksAndEdition("Prof Smith");
		
		assertTrue(textbookEditions.get(0).getEdition()==1);
		assertTrue(textbookEditions.get(1).getEdition()==2);
		
		assertFalse(textbookEditions.get(0).newEdition(textbookEditions.get(1)));
		assertFalse(textbookEditions.get(1).newEdition(textbookEditions.get(1)));
		assertTrue(textbookEditions.get(1).newEdition(textbookEditions.get(2)));
		
		// generate random item name
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
			int randomChar = 97 + (int) (random.nextFloat() * (122-97+1));
			buffer.append( (char) randomChar);
		}
		String randomTitle = buffer.toString();
		
		database.addTextbook(randomTitle, "Prof Smith");
		ArrayList<String> teacherTextbooks2 = new ArrayList<String>();
		teacherTextbooks2 = database.getTextbooks("Prof Smith");
		assertTrue(teacherTextbooks2.size()==(teacherTextbooks.size()+1));
		
	}
	
	@Test
	void testAllVirtualItems() throws CsvValidationException {
		SystemDatabase database = SystemDatabase.getInstance();
		
		ArrayList<TextbookInfo> virtualItems = new ArrayList<TextbookInfo>();
		virtualItems = database.getAllTextbooksAndEdtition();
		
		assertTrue(virtualItems.get(0).getTextbook().equals("book1"));
		assertTrue(virtualItems.get(0).getEdition()==2);
		assertTrue(virtualItems.get(8).getTextbook().equals("Physics"));
		assertTrue(virtualItems.get(8).getEdition()==3);
		assertTrue(virtualItems.get(10).getTextbook().equals("Chemistry"));
		assertTrue(virtualItems.get(10).getEdition()==2);
	}
	
	
	
	@Test
	void testAddPhysicalItem() throws CsvValidationException, FileNotFoundException, IOException {
		SystemDatabase database = SystemDatabase.getInstance();
			
		// generate random item name
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
			int randomChar = 97 + (int) (random.nextFloat() * (122-97+1));
			buffer.append( (char) randomChar);
		}
		String randomTitle = buffer.toString();
		
		database.addPhysicalItem(randomTitle, "some aisle");	
		
		
		PhysicalItem item = (PhysicalItem) database.getPhysicalItem(randomTitle);
		assertTrue(item.getLocation().equals("some aisle"));
		PhysicalItem item2 = (PhysicalItem) database.getPhysicalItem("thiswillneverexist");
		assertTrue(item2==null);
	}
	
	@Test
	void testGetPhysicalAttributes() {		
		SystemDatabase database = SystemDatabase.getInstance();
		PhysicalItem item = (PhysicalItem) database.getPhysicalItem("scienceBook");
		String location = item.getLocation();
		assertTrue(location.equals("science aisle"));
		String type = item.getType();
		int copies = item.getCopies();
		assertTrue(copies==19);
		String name = item.getName();
		assertTrue(name.equals("scienceBook"));
	}
	
	@Test
	void testAddVirtualItem() throws CsvValidationException, FileNotFoundException, IOException {
		SystemDatabase database = SystemDatabase.getInstance();
		final String virtualCSV = "src\\data\\VirtualItems.csv";

		
		// generate random item name
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
			int randomChar = 97 + (int) (random.nextFloat() * (122-97+1));
			buffer.append( (char) randomChar);
		}
		String randomTitle = buffer.toString();
		
		
		database.addVirtualItem(randomTitle, "1", "some text");
		
		String text = database.getVirtualItemText(randomTitle);
		assertTrue(text.equals("some text"));	
		
		String notext = database.getVirtualItemText("thiswillneverexist");
		assertTrue(notext==null);
	}
	
	
	@Test 
	void testStudentVirtualTextbookAttributes() {
		final String studentCSV = "src\\data\\StudentData.csv";
		SystemDatabase database = SystemDatabase.getInstance();
		String textbook = database.getVirtualItemTextbook("sir");
		assertTrue(textbook.equals("Dinos 1"));
		String expiry = database.getVirtualTextbookExpiry("sir");
		assertTrue(expiry.equals("02/12/24"));
		String textbook2 = database.getVirtualItemTextbook("thiswillneverexist");
		assertTrue(textbook2==null);
		String expiry2 = database.getVirtualTextbookExpiry("thiswilneverexist");
		assertTrue(expiry2==null);
	}
	
	@Test 
	void testVirtualTextbookAttributes() {
		SystemDatabase database = SystemDatabase.getInstance();
		VirtualItem item = (VirtualItem) database.getVirtualItem("book1");
		assertTrue(item.getContent().equals("text"));
		Item item2 = database.getVirtualItem("thiswillneverexist");
		assertTrue(item2==null);
		
		VirtualItem vitem = new VirtualItem("vitem");
		assertTrue(vitem.getName()=="vitem");
		
		VirtualItem vitem2 = new VirtualItem("othervitem", "2", false);
		vitem2.addText("some text");
		assertTrue(vitem2.getContent().equals("some text"));
		assertTrue(vitem2.getType().equals("virtual"));
	}
	
	@Test
	void testAddBookRequest() throws CsvValidationException, FileNotFoundException, IOException{
		SystemDatabase database = SystemDatabase.getInstance();
		
		// generate random item name
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
			int randomChar = 97 + (int) (random.nextFloat() * (122-97+1));
			buffer.append( (char) randomChar);
		}
		String randomTitle = buffer.toString();
		
		database.addBookRequest(randomTitle, "textbook", "2");
	}
	
	@Test
	void testNotifyDueDate() {
		
	}
	
	@Test
	void testRentPhysicalItem() {
		SystemDatabase database = SystemDatabase.getInstance();
		LocalDateTime now = LocalDateTime.now();
		ClientBuilder builder = new StudentBuilder();
		ClientDirector director = new ClientDirector(builder);
		director.construct("email", "password", "595");
		Client client = director.getProduct();
		PhysicalItem item = new PhysicalItem("name", "595", 10, "somewhere", true);
		database.rentItem(item, now, client);
		assertTrue(database.rentStatus(client)==false);
	}
	
	@Test
	void testRecommendItem() throws CsvValidationException {
		SystemDatabase database = SystemDatabase.getInstance();
		ArrayList<String> books = new ArrayList<String>();
		books = database.recommend("mysteryBook");
		assertTrue(books.get(0).equals("mysteryBook2"));
	}
	
	
	@Test
	void testProcureItem() {
		SystemDatabase database = SystemDatabase.getInstance();
		LocalDateTime now = LocalDateTime.now();
		PhysicalItem item = new PhysicalItem("book1", "123", 1, "somewhere", true);
		ClientBuilder builder = new StudentBuilder();
		ClientDirector director = new ClientDirector(builder);
		director.construct("email", "password", "99");
		Client client = director.getProduct();
		item.rentPhysicalItem("book1", now, client);
		item.rentPhysicalItem("book1", now, client);
		item.returnPhysicalItem("book1", client);
		assertTrue(item.getCopies()==2);
	}
	
	/*
	 * Client Registration and Validation
	 */
	@Test
    void testStudentRegistrationSuccess() {
        String email = "teststudent@university.com";
        String password = "Test123!";
        String userID = "S1234567";

        Student student = new Student(email, password, userID);
        Client client = student.getClient();

        assertNotNull(client, "The client should not be null");
        assertEquals(email, client.getEmail(), "Email should match");
        assertEquals(password, client.getPassword(), "Password should match");
        assertEquals(userID, client.getUserID(), "User ID should match");
        assertEquals("Student", client.getType(), "Type should be Student");
    }
    
	@Test
	void testStudentRegistrationSuccess2() {
	    String email = "secondstudent@university.com";
	    String password = "Pass456!";
	    String userID = "S2345678";

	    Student student = new Student(email, password, userID);
	    Client client = student.getClient();

	    assertNotNull(client, "The client should not be null");
	    assertEquals(email, client.getEmail(), "Email should match");
	    assertEquals(password, client.getPassword(), "Password should match");
	    assertEquals(userID, client.getUserID(), "User ID should match");
	    assertEquals("Student", client.getType(), "Type should be Student");
	}

	@Test
	void testStudentRegistrationSuccess3() {
	    String email = "thirdstudent@university.edu";
	    String password = "Secure789!";
	    String userID = "S3456789";

	    Student student = new Student(email, password, userID);
	    Client client = student.getClient();

	    assertNotNull(client, "The client should not be null");
	    assertEquals(email, client.getEmail(), "Email should match");
	    assertEquals(password, client.getPassword(), "Password should match");
	    assertEquals(userID, client.getUserID(), "User ID should match");
	    assertEquals("Student", client.getType(), "Type should be Student");
	}
	
    @Test
    void testFacultyMemberRegistration() {
        String email = "faculty@university.com";
        String password = "Faculty123!";
        String userID = "F1234567";

        FacultyMember facultyMember = new FacultyMember(email, password, userID);
        Client client = facultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals(userID, client.getUserID(), "User ID should match when validation passes");
        } 
    }
    
    @Test
    void testFacultyMemberRegistration2() {
        String email = "secondfaculty@university.com";
        String password = "Academy456!";
        String userID = "F2345678";

        FacultyMember facultyMember = new FacultyMember(email, password, userID);
        Client client = facultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals(userID, client.getUserID(), "User ID should match when validation passes");
        }
    }

    @Test
    void testFacultyMemberRegistration3() {
        String email = "thirdfaculty@university.edu";
        String password = "Prof123!";
        String userID = "F3456789";

        FacultyMember facultyMember = new FacultyMember(email, password, userID);
        Client client = facultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals(userID, client.getUserID(), "User ID should match when validation passes");
        }
    }
    
    @Test
    void testNonFacultyMemberRegistration() {
        String email = "nonfacultytest@university.com";
        String password = "Valid123!";
        String userID = "NF7654321";

        NonFacultyMember nonFacultyMember = new NonFacultyMember(email, password, userID);
        Client client = nonFacultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals("NonFacultyMember", client.getType(), "Type should be NonFacultyMember when validation passes");
        } 
    }

    @Test
    void testNonFacultyMemberRegistration2() {
        String email = "othernonfaculty@institution.com";
        String password = "Password234!";
        String userID = "NF8765432";

        NonFacultyMember nonFacultyMember = new NonFacultyMember(email, password, userID);
        Client client = nonFacultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals("NonFacultyMember", client.getType(), "Type should be NonFacultyMember when validation passes");
        }
    }

    @Test
    void testNonFacultyMemberRegistration3() {
        String email = "additionalnonfaculty@college.edu";
        String password = "Another987!";
        String userID = "NF9876543";

        NonFacultyMember nonFacultyMember = new NonFacultyMember(email, password, userID);
        Client client = nonFacultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals("NonFacultyMember", client.getType(), "Type should be NonFacultyMember when validation passes");
        }
    }
    
    @Test
    void testVisitorRegistrationProcess() {
        String email = "visitortest@university.com";
        String password = "Visitor123!";
        String userID = "V12345678";

        Visitor visitor = new Visitor(email, password, userID);
        Client client = visitor.getClient();

        assertNotNull(client, "The client should not be null for visitors");
        assertEquals(email, client.getEmail(), "Email should match for visitor registration");
        assertEquals(userID, client.getUserID(), "User ID should match for visitor registration");
    }

    @Test
    void testVisitorRegistrationProcess2() {
        String email = "secondvisitor@university.com";
        String password = "Welcome456!";
        String userID = "V23456789";

        Visitor visitor = new Visitor(email, password, userID);
        Client client = visitor.getClient();

        assertNotNull(client, "The client should not be null for visitors");
        assertEquals(email, client.getEmail(), "Email should match for visitor registration");
        assertEquals(userID, client.getUserID(), "User ID should match for visitor registration");
    }

    @Test
    void testVisitorRegistrationProcess3() {
        String email = "thirdvisitor@college.edu";
        String password = "Explore123!";
        String userID = "V34567890";

        Visitor visitor = new Visitor(email, password, userID);
        Client client = visitor.getClient();

        assertNotNull(client, "The client should not be null for visitors");
        assertEquals(email, client.getEmail(), "Email should match for visitor registration");
        assertEquals(userID, client.getUserID(), "User ID should match for visitor registration");
    }
    
    @Test
    void testLoginSuccess() {
        SystemDatabase.getInstance().addClient(new Client("Student", "loginemail@university.com", "Login123", "L12345678"));
        
        boolean loginResult = SystemDatabase.getInstance().clientLogin("loginemail@university.com", "Login123");
        
        assertTrue(loginResult, "Login should be successful");
    }
    
    @Test
    void testAddAndGetClientFromDatabase() {
        String email = "uniqueemail@university.com";
        String password = "Password123";
        String userID = "U12345678";
        Client newClient = new Client("Student", email, password, userID);

        SystemDatabase.getInstance().addClient(newClient);
        Client retrievedClient = SystemDatabase.getInstance().getClient(email);

        assertNotNull(retrievedClient, "Client should be retrieved from database");
        assertEquals(email, retrievedClient.getEmail(), "Retrieved client email should match");
        assertEquals("Student", retrievedClient.getType(), "Retrieved client type should match");
    }
    
    @Test
    void testFacultyMemberCourseAndTextbookManagement() throws CsvValidationException, FileNotFoundException, IOException {
        String email = "faculty@university.com";
        String password = "Faculty123!";
        String userID = "F1234567";
        String courseName = "Introduction to Testing";
        String textbookName = "Effective Testing in Java";

        FacultyMember facultyMember = new FacultyMember(email, password, userID);
        Client client = facultyMember.getClient();

        assertNotNull(client, "Client should not be null when validation passes");
        
        if (client != null) {
            facultyMember.addCourse(courseName);
            assertTrue(SystemDatabase.getInstance().getCourses(email).contains(courseName), "Course should be added to the database");

            facultyMember.remvoeCourse(courseName);
            assertFalse(SystemDatabase.getInstance().getCourses(email).contains(courseName), "Course should be removed from the database");

            facultyMember.addTextbook(textbookName);
            assertTrue(SystemDatabase.getInstance().getTextbooks(email).contains(textbookName), "Textbook should be added to the database");
        }
    }
    
    @Test
    void testStudentRegistrationDifferentUser() {
        String email = "anotherstudent@university.com";
        String password = "Pass789!";
        String userID = "S8901234";

        Student student = new Student(email, password, userID);
        Client client = student.getClient();

        assertNotNull(client, "The client should not be null");
        assertEquals(email, client.getEmail(), "Email should match");
        assertEquals(password, client.getPassword(), "Password should match");
        assertEquals(userID, client.getUserID(), "User ID should match");
        assertEquals("Student", client.getType(), "Type should be Student");
    }

    @Test
    void testFacultyMemberRegistrationDifferentUser() {
        String email = "newfaculty@university.com";
        String password = "NewFac123!";
        String userID = "F8901234";

        FacultyMember facultyMember = new FacultyMember(email, password, userID);
        Client client = facultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals(userID, client.getUserID(), "User ID should match when validation passes");
        }
    }

    @Test
    void testNonFacultyMemberRegistrationDifferentUser() {
        String email = "anothernonfaculty@university.com";
        String password = "Another123!";
        String userID = "NF8901234";

        NonFacultyMember nonFacultyMember = new NonFacultyMember(email, password, userID);
        Client client = nonFacultyMember.getClient();

        if (client != null) {
            assertEquals(email, client.getEmail(), "Email should match when validation passes");
            assertEquals("NonFacultyMember", client.getType(), "Type should be NonFacultyMember when validation passes");
        }
    }

    @Test
    void testVisitorRegistrationDifferentProcess() {
        String email = "newvisitortest@university.com";
        String password = "NewVisitor123!";
        String userID = "V8901234";

        Visitor visitor = new Visitor(email, password, userID);
        Client client = visitor.getClient();

        assertNotNull(client, "The client should not be null for visitors");
        assertEquals(email, client.getEmail(), "Email should match for visitor registration");
        assertEquals(userID, client.getUserID(), "User ID should match for visitor registration");
    }

    @Test
    void testLoginDifferentUserSuccess() {
        SystemDatabase.getInstance().addClient(new Client("Student", "anotherlogin@university.com", "AnotherLogin123", "L8901234"));
        
        boolean loginResult = SystemDatabase.getInstance().clientLogin("anotherlogin@university.com", "AnotherLogin123");
        
        assertTrue(loginResult, "Login should be successful");
    }

    @Test
    void testAddAndGetDifferentClientFromDatabase() {
        String email = "differentemail@university.com";
        String password = "Diff123";
        String userID = "U8901234";
        Client newClient = new Client("Student", email, password, userID);

        SystemDatabase.getInstance().addClient(newClient);
        Client retrievedClient = SystemDatabase.getInstance().getClient(email);

        assertNotNull(retrievedClient, "Client should be retrieved from database");
        assertEquals(email, retrievedClient.getEmail(), "Retrieved client email should match");
        assertEquals("Student", retrievedClient.getType(), "Retrieved client type should match");
    }

    @Test
    void testFacultyMemberDifferentCourseAndTextbookManagement() throws CsvValidationException, FileNotFoundException, IOException {
        String email = "differentfaculty@university.com";
        String password = "DiffFac123!";
        String userID = "F8901234";
        String courseName = "Advanced Testing Techniques";
        String textbookName = "Mastering Testing in Java";

        FacultyMember facultyMember = new FacultyMember(email, password, userID);
        Client client = facultyMember.getClient();

        assertNotNull(client, "Client should not be null when validation passes");
        
        if (client != null) {
            facultyMember.addCourse(courseName);
            assertTrue(SystemDatabase.getInstance().getCourses(email).contains(courseName), "Course should be added to the database");

            facultyMember.remvoeCourse(courseName);
            assertFalse(SystemDatabase.getInstance().getCourses(email).contains(courseName), "Course should be removed from the database");

            facultyMember.addTextbook(textbookName);
            assertTrue(SystemDatabase.getInstance().getTextbooks(email).contains(textbookName), "Textbook should be added to the database");
        }
    }
    
    /**
     * Added some test cases for bridge/factory package
     */
    @Test
    void testConcretePhysicalItemWithFirstConstructor() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(10, "Aisle B", false);
        assertEquals("Aisle B", item.getLocation(), "The location should be Aisle B.");
        assertEquals(10, item.getCopies(), "The number of copies should be 10.");
    }
	
    @Test
    void testConcretePhysicalItemWithFirstConstructor2() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(15, "Aisle C", true);
        assertEquals("Aisle C", item.getLocation(), "The location should be Aisle C.");
        assertEquals(15, item.getCopies(), "The number of copies should be 15.");
    }

    @Test
    void testConcretePhysicalItemWithFirstConstructor3() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(8, "Aisle D", false);
        assertEquals("Aisle D", item.getLocation(), "The location should be Aisle D.");
        assertEquals(8, item.getCopies(), "The number of copies should be 8.");
    }
    
    @Test
    void testRentItemApproachingDueDate() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(5, "Aisle G", true);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDateTime = now.plusDays(1); // Setting the due date to 1 day from now
        Client mockClient = new Client("TestClient", "test@client.com", "TestPassword", "54321");

        // Renting the book, should trigger notification about the approaching due date
        item.rentPhysicalItem("ApproachingDueDateBook", dueDateTime, mockClient);

        assertTrue(item.isBookRented("ApproachingDueDateBook"), "Book should be marked as rented.");
        assertEquals(dueDateTime, item.getDueDateForBook("ApproachingDueDateBook"), "The due date should match the one provided.");

    }
    
    @Test
    void testClientItemDelegation() {
        ConcretePhysicalItem concreteItem = new ConcretePhysicalItem(10, "TestBook", "Book", 5, "Aisle A", true);
        ClientItem clientItem = new ClientItem(concreteItem);
        assertEquals("TestBook", clientItem.getName(), "Name should be delegated to ConcreteItem");
        assertEquals(10, clientItem.getUniqueID(), "Unique ID should be delegated to ConcreteItem");
        assertEquals("Book", clientItem.getType(), "Type should be delegated to ConcreteItem");
    }
    
    @Test
    void testClientItemDelegation2() {
        ConcretePhysicalItem concreteItem = new ConcretePhysicalItem(12, "OtherBook", "Journal", 3, "Aisle B", false);
        ClientItem clientItem = new ClientItem(concreteItem);
        assertEquals("OtherBook", clientItem.getName(), "Name should be delegated to ConcreteItem");
        assertEquals(12, clientItem.getUniqueID(), "Unique ID should be delegated to ConcreteItem");
        assertEquals("Journal", clientItem.getType(), "Type should be delegated to ConcreteItem");
    }

    @Test
    void testClientItemDelegation3() {
        ConcretePhysicalItem concreteItem = new ConcretePhysicalItem(14, "AnotherTestBook", "Magazine", 7, "Aisle C", true);
        ClientItem clientItem = new ClientItem(concreteItem);
        assertEquals("AnotherTestBook", clientItem.getName(), "Name should be delegated to ConcreteItem");
        assertEquals(14, clientItem.getUniqueID(), "Unique ID should be delegated to ConcreteItem");
        assertEquals("Magazine", clientItem.getType(), "Type should be delegated to ConcreteItem");
    }
    
    @Test
    void testChangeItemName() {
        ConcreteItem concreteItem = new ConcreteItem(1, "InitialName", "InitialType");
        ClientItem clientItem = new ClientItem(concreteItem);
        clientItem.changeItemName("ChangedName");
        assertEquals("ChangedName", clientItem.getName(), "The name should be changed to 'ChangedName'.");
    }

    @Test
    void testChangeItemName2() {
        ConcreteItem concreteItem = new ConcreteItem(2, "OriginalName", "OriginalType");
        ClientItem clientItem = new ClientItem(concreteItem);
        clientItem.changeItemName("NewName");
        assertEquals("NewName", clientItem.getName(), "The name should be changed to 'NewName'.");
    }

    @Test
    void testChangeItemName3() {
        ConcreteItem concreteItem = new ConcreteItem(3, "StartingName", "StartingType");
        ClientItem clientItem = new ClientItem(concreteItem);
        clientItem.changeItemName("NewName2");
        assertEquals("NewName2", clientItem.getName(), "The name should be changed to 'UpdatedName'.");
    }
    
    @Test
    void testChangeItemType() {
        ConcreteItem concreteItem = new ConcreteItem(1, "InitialName", "InitialType");
        ClientItem clientItem = new ClientItem(concreteItem);
        clientItem.changeItemType("ChangedType");
        assertEquals("ChangedType", clientItem.getType(), "The type should be changed to 'ChangedType'.");
    }
    
    @Test
    void testChangeItemType2() {
        ConcreteItem concreteItem = new ConcreteItem(2, "InitialName2", "InitialType2");
        ClientItem clientItem = new ClientItem(concreteItem);
        clientItem.changeItemType("NewType");
        assertEquals("NewType", clientItem.getType(), "The type should be changed to 'NewType'.");
    }

    @Test
    void testChangeItemType3() {
        ConcreteItem concreteItem = new ConcreteItem(3, "StartName", "StartType");
        ClientItem clientItem = new ClientItem(concreteItem);
        clientItem.changeItemType("NewType2");
        assertEquals("NewType2", clientItem.getType(), "The type should be changed to 'UpdatedType'.");
    }
    
    @Test
    void testConstructorWithEditionAvailabilityPriority() {
        String edition = "First Edition";
        boolean availability = true;
        double priority = 1.0;
        ConcreteVirtualTextbook textbook = new ConcreteVirtualTextbook(edition, availability, priority);
        assertEquals(edition, textbook.getEdition(), "Edition should be set correctly by the constructor.");
        assertEquals(availability, textbook.isAvailability(), "Availability should be set correctly by the constructor.");
        assertEquals(priority, textbook.getPriority(), "Priority should be set correctly by the constructor.");
    }

    @Test
    void testConstructorWithEditionAvailabilityPriority2() {
        String edition = "Second Edition";
        boolean availability = false;
        double priority = 2.0;
        ConcreteVirtualTextbook textbook = new ConcreteVirtualTextbook(edition, availability, priority);
        assertEquals(edition, textbook.getEdition(), "Edition should be set correctly by the constructor.");
        assertEquals(availability, textbook.isAvailability(), "Availability should be set correctly by the constructor.");
        assertEquals(priority, textbook.getPriority(), "Priority should be set correctly by the constructor.");
    }

    @Test
    void testConstructorWithEditionAvailabilityPriority3() {
        String edition = "Third Edition";
        boolean availability = true;
        double priority = 3.0;
        ConcreteVirtualTextbook textbook = new ConcreteVirtualTextbook(edition, availability, priority);
        assertEquals(edition, textbook.getEdition(), "Edition should be set correctly by the constructor.");
        assertEquals(availability, textbook.isAvailability(), "Availability should be set correctly by the constructor.");
        assertEquals(priority, textbook.getPriority(), "Priority should be set correctly by the constructor.");
    }
    
    @Test
    void testConstructorWithAllFields() {
        int uniqueID = 123;
        String name = "Algorithms";
        String typeOfItem = "Textbook";
        String edition = "Second Edition";
        boolean availability = false;
        double priority = 5.0;
        ConcreteVirtualTextbook textbook = new ConcreteVirtualTextbook(uniqueID, name, typeOfItem, edition, availability, priority); 
        assertEquals(edition, textbook.getEdition(), "Edition should be set correctly by the constructor.");
        assertEquals(availability, textbook.isAvailability(), "Availability should be set correctly by the constructor.");
        assertEquals(priority, textbook.getPriority(), "Priority should be set correctly by the constructor.");
    }
    
    @Test
    void testConstructorWithAllFields2() {
        int uniqueID = 456;
        String name = "Data Structures";
        String typeOfItem = "Reference";
        String edition = "Third Edition";
        boolean availability = true;
        double priority = 4.5;
        ConcreteVirtualTextbook textbook = new ConcreteVirtualTextbook(uniqueID, name, typeOfItem, edition, availability, priority); 
        assertEquals(edition, textbook.getEdition(), "Edition should be set correctly by the constructor.");
        assertEquals(availability, textbook.isAvailability(), "Availability should be set correctly by the constructor.");
        assertEquals(priority, textbook.getPriority(), "Priority should be set correctly by the constructor.");
    }

    @Test
    void testConstructorWithAllFields3() {
        int uniqueID = 789;
        String name = "Machine Learning";
        String typeOfItem = "Academic";
        String edition = "First Edition";
        boolean availability = false;
        double priority = 3.5;
        ConcreteVirtualTextbook textbook = new ConcreteVirtualTextbook(uniqueID, name, typeOfItem, edition, availability, priority); 
        assertEquals(edition, textbook.getEdition(), "Edition should be set correctly by the constructor.");
        assertEquals(availability, textbook.isAvailability(), "Availability should be set correctly by the constructor.");
        assertEquals(priority, textbook.getPriority(), "Priority should be set correctly by the constructor.");
    }
    
    @Test
    void testRentConcretePhysicalItem() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(20, "Aisle A", true);
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(30);
        Client mockClient = new Client("MockClient", "mock@client.com", "MockPassword", "12345");
        
        item.rentPhysicalItem("TestBook", dueDateTime, mockClient);
        
        assertTrue(item.isBookRented("TestBook"), "Book should be rented.");
        assertEquals(dueDateTime, item.getDueDateForBook("TestBook"), "Due date should be set correctly.");
    }

    @Test
    void testRentConcretePhysicalItem2() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(15, "Aisle B", false);
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(15);
        Client mockClient = new Client("TestClient", "test@client.com", "TestPassword", "67890");
        
        item.rentPhysicalItem("AnotherBook", dueDateTime, mockClient);
        
        assertTrue(item.isBookRented("AnotherBook"), "Book should be rented.");
        assertEquals(dueDateTime, item.getDueDateForBook("AnotherBook"), "Due date should be set correctly.");
    }

    @Test
    void testRentConcretePhysicalItem3() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(25, "Aisle C", true);
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(20);
        Client mockClient = new Client("ExampleClient", "example@client.com", "ExamplePassword", "54321");
        
        item.rentPhysicalItem("ExampleBook", dueDateTime, mockClient);
        
        assertTrue(item.isBookRented("ExampleBook"), "Book should be rented.");
        assertEquals(dueDateTime, item.getDueDateForBook("ExampleBook"), "Due date should be set correctly.");
    }
    
    @Test
    void testReturnConcretePhysicalItem() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(20, "Aisle A", true);
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(30);
        Client mockClient = new Client("MockClient", "mock@client.com", "MockPassword", "12345");
        
        item.rentPhysicalItem("TestBook", dueDateTime, mockClient);
        item.returnPhysicalItem("TestBook", mockClient);
        
        assertFalse(item.isBookRented("TestBook"), "Book should be returned and not rented.");
    }
    
    @Test
    void testReturnConcretePhysicalItem2() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(30, "Aisle D", true);
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(10);
        Client mockClient = new Client("UserClient", "user@client.com", "UserPassword", "98765");
        
        item.rentPhysicalItem("UserBook", dueDateTime, mockClient);
        item.returnPhysicalItem("UserBook", mockClient);
        
        assertFalse(item.isBookRented("UserBook"), "Book should be returned and not rented.");
    }

    @Test
    void testReturnConcretePhysicalItem3() {
        ConcretePhysicalItem item = new ConcretePhysicalItem(5, "Aisle E", false);
        LocalDateTime dueDateTime = LocalDateTime.now().plusDays(5);
        Client mockClient = new Client("SampleClient", "sample@client.com", "SamplePassword", "12389");
        
        item.rentPhysicalItem("SampleBook", dueDateTime, mockClient);
        item.returnPhysicalItem("SampleBook", mockClient);
        
        assertFalse(item.isBookRented("SampleBook"), "Book should be returned and not rented.");
    }
    
    @Test
    void testGetVirtualItem() {
        ItemFactory factory = new ItemFactory();
        ClientItem virtualItem = factory.getVirtualItem(1, "Virtual Book", "Book", 0, "", false);
        // Assert that the ClientItem wraps a ConcretePhysicalItem
        assertTrue(virtualItem.getUniqueID() == 1);
        assertTrue(virtualItem.getName().equals("Virtual Book"));
        assertTrue(virtualItem.getType().equals("Book"));
    }

    @Test
    void testGetVirtualItem2() {
        ItemFactory factory = new ItemFactory();
        ClientItem virtualItem = factory.getVirtualItem(3, "Virtual Journal", "Journal", 0, "Online", true);
        assertTrue(virtualItem.getUniqueID() == 3);
        assertTrue(virtualItem.getName().equals("Virtual Journal"));
        assertTrue(virtualItem.getType().equals("Journal"));
    }

    @Test
    void testGetVirtualItem3() {
        ItemFactory factory = new ItemFactory();
        ClientItem virtualItem = factory.getVirtualItem(4, "Virtual Magazine", "Magazine", 0, "Web", false);
        assertTrue(virtualItem.getUniqueID() == 4);
        assertTrue(virtualItem.getName().equals("Virtual Magazine"));
        assertTrue(virtualItem.getType().equals("Magazine"));
    }
    
    @Test
    void testGetPhysicalItem() {
        ItemFactory factory = new ItemFactory();
        ClientItem physicalItem = factory.getPhysicalItem(2, "Physical Textbook", "Textbook", "First Edition", true, 1.0);
        // Assert that the ClientItem wraps a ConcreteVirtualTextbook
        assertTrue(physicalItem.getUniqueID() == 2);
        assertTrue(physicalItem.getName().equals("Physical Textbook"));
        assertTrue(physicalItem.getType().equals("Textbook"));
    }

    @Test
    void testGetPhysicalItem2() {
        ItemFactory factory = new ItemFactory();
        ClientItem physicalItem = factory.getPhysicalItem(5, "History Textbook", "Textbook", "Fourth Edition", false, 2.5);
        assertTrue(physicalItem.getUniqueID() == 5);
        assertTrue(physicalItem.getName().equals("History Textbook"));
        assertTrue(physicalItem.getType().equals("Textbook"));
    }

    @Test
    void testGetPhysicalItem3() {
        ItemFactory factory = new ItemFactory();
        ClientItem physicalItem = factory.getPhysicalItem(6, "Geography Textbook", "Textbook", "Second Edition", true, 1.5);
        assertTrue(physicalItem.getUniqueID() == 6);
        assertTrue(physicalItem.getName().equals("Geography Textbook"));
        assertTrue(physicalItem.getType().equals("Textbook"));
    }
	
    /*
     * Newsletter test cases
     */
    @Test
    public void testGetNewsletterWithExistingName() {
        String name = "some name";
        String url = "http://someurl.com";
        NewsletterFactory.getNewsletter(name, url);
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
        assertEquals(name, newsletter.getName());
        assertEquals(url, newsletter.getUrl());
    }
    
    @Test
    public void testGetNewsletterWithNewName() {
        String name = "new name";
        String url = "http://example.com/newname";
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
        assertEquals(name, newsletter.getName());
        assertEquals(url, newsletter.getUrl());
    }

    @Test
    public void testGetNewsletterWithNullName() {
        String name = null;
        String url = "http://example.com/nullnewsletter";
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
    }

    @Test
    public void testGetNewsletterWithEmptyName() {
        String name = "";
        String url = "http://url.com/empty";
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
    }

    @Test
    public void testGetNewsletterWithNullUrl() {
        String name = "null name";
        String url = null;
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
    }

    @Test
    public void testGetNewsletterWithEmptyUrl() {
        String name = "nourl";
        String url = "";
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
    }

    @Test
    public void testGetNewsletterWithWhitespaceName() {
        String name = "   ";
        String url = "http://url.com/noname";
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
    }

    @Test
    public void testGetNewsletterWithWhitespaceUrl() {
        String name = "spaced name";
        String url = "    ";
        Newsletter newsletter = NewsletterFactory.getNewsletter(name, url);
        assertNotNull(newsletter);
    }

    @Test
    public void testGetNewsletterWithSameNameDifferentUrl() {
        String name = "name";
        String url1 = "https://url.com/newsletter1";
        String url2 = "https://url.com/newsletter2";
        Newsletter newsletter1 = NewsletterFactory.getNewsletter(name, url1);
        Newsletter newsletter2 = NewsletterFactory.getNewsletter(name, url2);
        assertSame(newsletter1, newsletter2);
    }

    @Test
    public void testGetNewsletterWithDifferentNameDifferentUrl() {
        String name1 = "Newsletter 1";
        String name2 = "Newsletter 2";
        String url1 = "https://someurl.com/newsletter1";
        String url2 = "https://someurl.com/newsletter2";
        Newsletter newsletter1 = NewsletterFactory.getNewsletter(name1, url1);
        Newsletter newsletter2 = NewsletterFactory.getNewsletter(name2, url2);
        assertNotSame(newsletter1, newsletter2);
    }

    @Test
    public void testBookRequestConstructor() {
        // Create a book request
        BookRequest bookRequest = new BookRequest("Harry Potter", "I would like to borrow this book.", "High");
        
        // Check if the values are set correctly
        assertEquals("Harry Potter", bookRequest.getRequestedBook());
        assertEquals("I would like to borrow this book.", bookRequest.getRequestedMessage());
        assertEquals("High", bookRequest.getRequestPriority());
    }

    /*
     * Added tests for system payment
     */
    @Test
    void testPaymentWithCredit() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("credit", 100.00, "C123");
        assertEquals("Credit payment of $100.0 completed. Payment ID: C123", result, "Credit payment should be processed correctly.");
    }

    @Test
    void testPaymentWithDebit() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("debit", 50.00, "D123");
        assertEquals("Debit payment of $50.0 completed. Payment ID: D123", result, "Debit payment should be processed correctly.");
    }

    @Test
    void testPaymentWithMobileWallet() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("mobile wallet", 75.00, "M123");
        assertEquals("Mobile wallet payment of $75.0 completed. Payment ID: M123", result, "Mobile wallet payment should be processed correctly.");
    }

    @Test
    void testPaymentWithUnrecognizedType() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("unknown", 30.00, "U123");
        assertEquals("Payment type unrecognized. Transaction aborted. Payment ID: U123", result, "Unrecognized payment type should fail.");
    }
    
    @Test
    void testPaymentWithCreditLowAmount() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("credit", 1.00, "CL123");
        assertEquals("Credit payment of $1.0 completed. Payment ID: CL123", result, "Credit payment for low amount should be processed correctly.");
    }

    @Test
    void testPaymentWithDebitHighAmount() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("debit", 10000.00, "DH123");
        assertEquals("Debit payment of $10000.0 completed. Payment ID: DH123", result, "Debit payment for high amount should be processed correctly.");
    }

    @Test
    void testPaymentWithMobileWalletExactAmount() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("mobile wallet", 123.45, "MW123");
        assertEquals("Mobile wallet payment of $123.45 completed. Payment ID: MW123", result, "Mobile wallet payment with exact amount should be processed correctly.");
    }

    @Test
    void testPaymentWithDebitZeroAmount() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("debit", 0.00, "DZ123");
        assertEquals("Debit payment of $0.0 completed. Payment ID: DZ123", result, "Debit payment with zero amount should be processed correctly.");
    }

    @Test
    void testPaymentWithCreditMaximumAmount() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("credit", 999999.99, "CM123");
        assertEquals("Credit payment of $999999.99 completed. Payment ID: CM123", result, "Credit payment with maximum amount should be processed correctly.");
    }
    
    @Test
    void testPaymentWithUnrecognizedTypeAndAmount() {
        SystemPayment payment = SystemPayment.getInstance();
        String result = payment.payment("bitcoin", 500.00, "BT123");
        assertEquals("Payment type unrecognized. Transaction aborted. Payment ID: BT123", result, "Payment with unrecognized type and valid amount should fail.");
    }
    
    @Test
    void testGetExistingVirtualBook() {
        VirtualItemFactory.getVirtualBook("Calculus", "", true); 
        VirtualItem existingItem = VirtualItemFactory.getVirtualBook("Calculus", "", true);
        
        assertNotNull(existingItem, "Should retrieve an existing virtual item without creating a new one.");
        assertTrue(existingItem instanceof VirtualItem, "Retrieved object should be an instance of VirtualItem.");
    }
    
    @Test
    public void testClientConstructorAndGetters() {
        // Create a Client object
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Test constructor and getters
        assertEquals("Regular", client.getType());
        assertEquals("test@example.com", client.getEmail());
        assertEquals("password", client.getPassword());
        assertEquals("12345", client.getUserID());
        assertEquals(0, client.getRentCount()); // Initial rent count should be 0
    }
   
    @Test
    public void testClientSetters() {
        // Create a Client object
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Test setters
        client.setEmail("new@example.com");
        assertEquals("new@example.com", client.getEmail());
        client.setPassword("newpassword");
        assertEquals("newpassword", client.getPassword());
        client.setUserID("54321");
        assertEquals("54321", client.getUserID());
    }
   
    @Test
    public void testClientRentCount() {
        // Create a Client object
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Test rent count increment
        assertEquals(0, client.getRentCount());
        client.setRentCount();
        assertEquals(1, client.getRentCount());
        client.setRentCount();
        assertEquals(2, client.getRentCount());
    }
   
    @Test
    public void testClientRentedPhysicalItems() {
        // Create a Client object
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Test adding and displaying rented physical items
        LocalDateTime dueDate = LocalDateTime.now().plusDays(7);
        client.addRentedItem("BookA", dueDate);
        Map<String, LocalDateTime> rentedItems = client.displayRentedBooks();
        assertTrue(rentedItems.containsKey("BookA"));
        assertEquals(dueDate, rentedItems.get("BookA"));
    }
   
    @Test
    public void testClientGetType() {
        // Create a Client object with type "Regular"
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Verify that getType() returns the correct type
        assertEquals("Regular", client.getType());
    }
   
    @Test
    public void testClientNotifyDueDate() {
        // Create a Client object
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Add a rented item due within 24 hours
        LocalDateTime dueDateWithin24Hours = LocalDateTime.now().plusHours(12);
        client.addRentedItem("BookA", dueDateWithin24Hours);
        // Add a rented item that is already overdue
        LocalDateTime pastDueDate = LocalDateTime.now().minusDays(2);
        client.addRentedItem("BookB", pastDueDate);
        // Add a rented item due in the future
        LocalDateTime futureDueDate = LocalDateTime.now().plusDays(5);
        client.addRentedItem("BookC", futureDueDate);
        // Retrieve due date notifications
        List<String> notifications = client.notifyDueDate();
        // Verify notifications
        assertEquals(2, notifications.size()); // Should have notifications for 2 items
        // Check notification for item due within 24 hours
        assertTrue(notifications.contains("Warning: \nLess than 24hrs left\nuntil the due date for item BookA"));
        // Check notification for overdue item
        assertTrue(notifications.contains("Warning: \nThe due date for item BookB has passed."));
        // Verify that there's no notification for the item due in the future
        assertFalse(notifications.contains("Warning: \nLess than 24hrs left\nuntil the due date for item BookC"));
    }
   
    @Test
    public void testClientUpdate() {
        // Create a new Client object
        Client client = new Client("Regular", "test@example.com", "password", "12345");
        // Test Case 1: Adding a new item with a non-null dueDate
        String bookTitleToAdd = "BookA";
        LocalDateTime dueDateToAdd = LocalDateTime.now().plusDays(7);
        // Call update() to add the new item
        client.update(bookTitleToAdd, dueDateToAdd);
        // Verify that the item was added to rentedPhysicalItems map
        Map<String, LocalDateTime> rentedItemsAfterAdd = client.displayRentedBooks();
        assertTrue(rentedItemsAfterAdd.containsKey(bookTitleToAdd));
        assertEquals(dueDateToAdd, rentedItemsAfterAdd.get(bookTitleToAdd));
        // Test Case 2: Removing an existing item with a null dueDate
        String bookTitleToRemove = "BookB";
        LocalDateTime dueDateToRemove = LocalDateTime.now().plusDays(5);
        // Add an item first to simulate an existing rented item
        client.addRentedItem(bookTitleToRemove, dueDateToRemove);
        // Call update() to remove the existing item
        client.update(bookTitleToRemove, null);
        // Verify that the item was removed from rentedPhysicalItems map
        Map<String, LocalDateTime> rentedItemsAfterRemove = client.displayRentedBooks();
        assertFalse(rentedItemsAfterRemove.containsKey(bookTitleToRemove));
    }
    @Test
    public void testClientToString() {
        // Create a Client object with specific attributes
        String type = "Regular";
        String email = "test@example.com";
        String password = "password";
        String userID = "12345";
        Client client = new Client(type, email, password, userID);
        // Call toString() method to get the string representation
        String toStringResult = client.toString();
        // Construct the expected string representation manually
        String expectedString = "Client{" + "type=" + "Regular" + '\\' + "email=" + "test@example.com" + '\\' + "password=" + "password" + '\\' + "userID=" + "12345" + "}";
        // Verify that the returned string matches the expected format
        assertEquals(expectedString, toStringResult);
    }
    
}

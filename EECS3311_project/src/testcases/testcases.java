package testcases;

import static org.junit.jupiter.api.Assertions.*;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import BuilderPattern.ClientBuilder;
import BuilderPattern.ClientDirector;
import BuilderPattern.StudentBuilder;
import Models.Client;
import Models.Item;
import Models.PhysicalItem;
import Models.SystemDatabase;
import Models.TextbookInfo;
import Models.VirtualItem;

class testcases {
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
	

	
	
}

package builder;

public class Main {
	public static void main(String[] args) {
		
		/**
		 Builder Pattern
		 * Example of how to create clients
		 * - Create director with client type builder then assign attributes
		 * - Create Client and assign the director
		 * 
		 Example:
		 * ClientDirector studentDirector = new ClientDirector(new StudentBuilder());
		 * studentDirector.construct("someemail@example.com", "somepassword", "someID1");
		 * Client studentClient = studentDirector.getProduct(); 
		 * System.out.println(studentClient); //prints details of client 
		 */
		ClientDirector visitorDirector = new ClientDirector(new VisitorBuilder());
		String someEmail = "email";
		String somePassword = "123";
		String someID = "ID2";
		visitorDirector.construct(someEmail, somePassword, someID);
		Client visitorClient = visitorDirector.getProduct(); 
		System.out.println(visitorClient); //prints details of client
	}

}

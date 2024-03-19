package Models;

import BuilderPattern.StudentBuilder;
import SingletonPattern.SingleMTObject;
import SingletonPattern.SingleSNObject;
import BuilderPattern.ClientDirector;

public class Student {
	private ClientDirector studentDirector;
	private String[] courses;
	private String[] textbooks;
	
	
	public Student(String email, String password, String userID) {
		boolean validation = ManagementTeam.getInstance().furtherValidation();
		if (validation==true) {
			this.studentDirector = new ClientDirector(new StudentBuilder());
			this.studentDirector.construct(email, password, userID);
		} else {
			
			SingleSNObject.getInstance().registrationFailed();
		}
	}
	
	public Client getClient() {
		return this.studentDirector.getProduct(); 
	}
	
	// Additional functionalities

}

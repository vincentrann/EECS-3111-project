package Models;

import BuilderPattern.StudentBuilder;
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
			
			SystemNotification.getInstance().registrationFailed();
		}
	}
	
	public Client getClient() {
		return this.studentDirector.getProduct(); 
	}
	
	// Additional functionalities

}

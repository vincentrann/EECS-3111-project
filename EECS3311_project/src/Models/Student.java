package Models;

import BuilderPattern.StudentBuilder;
import BuilderPattern.ClientDirector;
import BuilderPattern.FacultyMemberBuilder;

public class Student {
	private ClientDirector studentDirector;
	private String[] courses;
	private String[] previousBooks;
	
	
	public Student(String email, String password, String userID) {
		ManagementTeam team = new ManagementTeam();
		boolean validation = team.furthervalidation();
		if (validation==true) {
			this.studentDirector = new ClientDirector(new StudentBuilder());
			this.studentDirector.construct(email, password, userID);
		} else {
			SystemNotification noti = new SystemNotification();
			noti.registrationFailed();
			System.out.println("failed");
	        // redo registration
		}
	}
	
	public Client getClient() {
		return this.studentDirector.getProduct(); 
	}
	
	// Additional functionalities

}

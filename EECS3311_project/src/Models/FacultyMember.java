package Models;

import BuilderPattern.ClientDirector;

import BuilderPattern.FacultyMemberBuilder;


public class FacultyMember {
	private ClientDirector facultyMemberDirector;
	private String[] courses;
	private String[] previousBooks;
	
	
	public FacultyMember(String email, String password, String userID) {
		ManagementTeam team = new ManagementTeam();
		boolean validation = team.furthervalidation();
		if (validation==true) {
			this.facultyMemberDirector = new ClientDirector(new FacultyMemberBuilder());
			this.facultyMemberDirector.construct(email, password, userID);
		} else {
			SystemNotification noti = new SystemNotification();
			noti.registrationFailed();
			System.out.println("failed");
	        // redo registration
		}
	}
	
	public Client getClient() {
		return this.facultyMemberDirector.getProduct(); 
	}
	
	// Additional functionalities

}

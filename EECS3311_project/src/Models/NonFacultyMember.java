package Models;

import BuilderPattern.ClientDirector;
import BuilderPattern.FacultyMemberBuilder;
import BuilderPattern.NonFacultyMemberBuilder;

public class NonFacultyMember {
	private ClientDirector nonFacultyMemberDirector;
	
	public NonFacultyMember(String email, String password, String userID) {
		ManagementTeam team = new ManagementTeam();
		boolean validation = team.furthervalidation();
		if (validation==true) {
			this.nonFacultyMemberDirector = new ClientDirector(new NonFacultyMemberBuilder());
			this.nonFacultyMemberDirector.construct(email, password, userID);
		} else {
			SystemNotification noti = new SystemNotification();
			noti.registrationFailed();
			System.out.println("failed");
	        // redo registration
		}
	}
	
	public Client getClient() {
		return this.nonFacultyMemberDirector.getProduct(); 
	}
	
	// Additional functionalities

}

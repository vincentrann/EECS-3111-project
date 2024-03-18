package Models;

import BuilderPattern.ClientDirector;


import BuilderPattern.FacultyMemberBuilder;
import SingletonPattern.SingleSNObject;


public class FacultyMember {
	private ClientDirector facultyMemberDirector;
	private String[] courses;
	private String[] previousBooks;
	
	
	public FacultyMember(String email, String password, String userID) {
		ManagementTeam team = ManagementTeam.getInstance();
		boolean validation = team.furtherValidation();
		if (validation==true) {
			this.facultyMemberDirector = new ClientDirector(new FacultyMemberBuilder());
			this.facultyMemberDirector.construct(email, password, userID);
		} else {

			SingleSNObject.getInstance().registrationFailed();
		}
	}
	
	public Client getClient() {
		return this.facultyMemberDirector.getProduct(); 
	}
	
	// Additional functionalities

}

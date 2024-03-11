package Models;

import BuilderPattern.ClientDirector;
import BuilderPattern.FacultyMemberBuilder;

public class FacultyMember {
	private ClientDirector facultyMemberDirector;
	
	public FacultyMember(String email, String password, String userID) {
		this.facultyMemberDirector = new ClientDirector(new FacultyMemberBuilder());
		this.facultyMemberDirector.construct(email, password, userID);
	}
	
	public Client getClient() {
		return this.facultyMemberDirector.getProduct(); 
	}
	
	// Additional functionalities

}

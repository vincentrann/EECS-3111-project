package Models;

import BuilderPattern.ClientDirector;
import BuilderPattern.NonFacultyMemberBuilder;

public class NonFacultyMember {
	private ClientDirector nonFacultyMemberDirector;
	
	public NonFacultyMember(String email, String password, String userID) {
		this.nonFacultyMemberDirector = new ClientDirector(new NonFacultyMemberBuilder());
		this.nonFacultyMemberDirector.construct(email, password, userID);
	}
	
	public Client getClient() {
		return this.nonFacultyMemberDirector.getProduct(); 
	}
	
	// Additional functionalities

}

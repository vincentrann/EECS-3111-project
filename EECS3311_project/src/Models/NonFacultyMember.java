package Models;

import BuilderPattern.ClientDirector;
import BuilderPattern.FacultyMemberBuilder;
import BuilderPattern.NonFacultyMemberBuilder;
import SingletonPattern.SingleMTObject;
import SingletonPattern.SingleSNObject;

public class NonFacultyMember {
	private ClientDirector nonFacultyMemberDirector;
	
	public NonFacultyMember(String email, String password) {
		boolean validation = SingleMTObject.getInstance().furtherValidation();
		if (validation==true) {
			this.nonFacultyMemberDirector = new ClientDirector(new NonFacultyMemberBuilder());
			this.nonFacultyMemberDirector.construct(email, password);
		} else {
			
			SingleSNObject.getInstance().registrationFailed();
		}
	}
	
	public Client getClient() {
		return this.nonFacultyMemberDirector.getProduct(); 
	}
	
	// Additional functionalities

}

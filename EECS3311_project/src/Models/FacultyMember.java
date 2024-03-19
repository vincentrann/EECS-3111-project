package Models;

import BuilderPattern.ClientDirector;


import BuilderPattern.FacultyMemberBuilder;
import SingletonPattern.SingleSNObject;


public class FacultyMember {
	private ClientDirector facultyMemberDirector;
	
	public FacultyMember(String email, String password) {
		ManagementTeam team = ManagementTeam.getInstance();
		boolean validation = team.furtherValidation();
		if (validation==true) {
			this.facultyMemberDirector = new ClientDirector(new FacultyMemberBuilder());
			this.facultyMemberDirector.construct(email, password);
		} else {

			SingleSNObject.getInstance().registrationFailed();
		}
	}
	
	public Client getClient() {
		return this.facultyMemberDirector.getProduct(); 
	}
	
	public void addTextbook(String textbook) {
		SystemDatabase.getInstance().addTextbook(textbook, facultyMemberDirector.getProduct().getEmail());
		
	}
	
	public void addCourse(String course) {
		SystemDatabase.getInstance().addCourse(course, facultyMemberDirector.getProduct().getEmail());
	}
	
	public void remvoeCourse(String course) {
		SystemDatabase.getInstance().removeCourse(course, facultyMemberDirector.getProduct().getEmail());
	}

}

package Models;

import com.opencsv.exceptions.CsvValidationException;

import BuilderPattern.ClientDirector;


import BuilderPattern.FacultyMemberBuilder;



public class FacultyMember {
	private ClientDirector facultyMemberDirector;
	
	public FacultyMember(String email, String password, String userID) {
		ManagementTeam team = ManagementTeam.getInstance();
		boolean validation = team.furtherValidation();
		if (validation==true) {
			this.facultyMemberDirector = new ClientDirector(new FacultyMemberBuilder());
			this.facultyMemberDirector.construct(email, password, userID);
		} else {

			SystemNotification.getInstance().registrationFailed();
		}
	}
	
	public Client getClient() {
		return this.facultyMemberDirector.getProduct(); 
	}
	
	public void addTextbook(String textbook) {
		SystemDatabase.getInstance().addTextbook(textbook, facultyMemberDirector.getEmail());
		
	}
	
	public void addCourse(String course) {
		SystemDatabase.getInstance().addCourse(course, facultyMemberDirector.getEmail());
	}
	
	public void remvoeCourse(String course) throws CsvValidationException {
		SystemDatabase.getInstance().removeCourse(course, facultyMemberDirector.getEmail());
	}

}

package BuilderPattern;

import Models.Client;

public class NonFacultyMemberBuilder implements ClientBuilder{
	private Client client;
	
	public NonFacultyMemberBuilder() {
		this.client = new Client("NonFacultyMember", "", "", "");
	}

	@Override
	public void setEmail(String email) {
		//client.email = email;
		client.setEmail(email);
	}

	@Override
	public void setPassword(String password) {
		//client.password = password;
		client.setPassword(password);
	}

	@Override
	public void setUserID(String userID) {
		//client.userID = userID;
		client.setUserID(userID);
	}
	
	@Override
	public Client build() {
		return client;
	}
	
	
	//Add additional functions for this Client Type
}

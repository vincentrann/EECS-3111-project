package builder;

public class StudentBuilder implements ClientBuilder{
	private Client client;
	
	public StudentBuilder() {
		this.client = new Client("Student", "", "", "");
	}

	@Override
	public void setEmail(String email) {
		client.email = email;
	}

	@Override
	public void setPassword(String password) {
		client.password = password;
	}

	@Override
	public void setUserID(String userID) {
		client.userID = userID;
	}
	
	@Override
	public Client build() {
		return client;
	}
	
	
	//Add additional functions for this Client Type
	
}

package builder;

public class VisitorBuilder implements ClientBuilder{
	private Client client;
	
	public VisitorBuilder() {
		this.client = new Client("Visitor", "", "", "");
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

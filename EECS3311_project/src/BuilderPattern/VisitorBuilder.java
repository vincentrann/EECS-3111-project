package BuilderPattern;

import Models.Client;

public class VisitorBuilder implements ClientBuilder{
	private Client client;
	
	public VisitorBuilder() {
		this.client = new Client("Visitor", "", "", "");
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

}

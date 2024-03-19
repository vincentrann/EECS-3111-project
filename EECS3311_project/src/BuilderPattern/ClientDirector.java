package BuilderPattern;

import Models.Client;

public class ClientDirector {
	private ClientBuilder clientBuilder;
	
	public ClientDirector(ClientBuilder clientBuilder) {
		this.clientBuilder = clientBuilder;
	}
	
	public void construct(String email, String password, String userID) {
		clientBuilder.setEmail(email);
		clientBuilder.setPassword(password);
		clientBuilder.setUserID(userID);
	}
	
	public Client getProduct() {
		return clientBuilder.build();
	}
	
	public String getEmail() {
		return clientBuilder.build().getEmail();
	}

}

package BuilderPattern;

import Models.Client;

public class ClientDirector {
	private ClientBuilder clientBuilder;
	
	public ClientDirector(ClientBuilder clientBuilder) {
		this.clientBuilder = clientBuilder;
	}
	
	public void construct(String email, String password) {
		clientBuilder.setEmail(email);
		clientBuilder.setPassword(password);
	}
	
	public Client getProduct() {
		return clientBuilder.build();
	}

}

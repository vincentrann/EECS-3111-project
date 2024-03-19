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
<<<<<<< HEAD
	
	public String getEmail() {
		return clientBuilder.build().getEmail();
	}
=======

>>>>>>> 26122ca680675c30330aa89624ce9d9bd1853713
}

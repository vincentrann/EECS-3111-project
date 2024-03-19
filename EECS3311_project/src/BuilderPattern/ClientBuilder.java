package BuilderPattern;

import Models.Client;

public interface ClientBuilder{
	void setEmail(String email);
	void setPassword(String password);
	Client build();
}

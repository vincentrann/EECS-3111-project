package BuilderPattern;

import Models.Client;

public interface ClientBuilder{
	void setEmail(String email);
	void setPassword(String password);
	void setUserID(String userID);
	Client build();
}

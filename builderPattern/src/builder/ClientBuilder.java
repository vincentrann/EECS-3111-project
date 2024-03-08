package builder;

public interface ClientBuilder{
	void setEmail(String email);
	void setPassword(String password);
	void setUserID(String userID);
	Client build();
}

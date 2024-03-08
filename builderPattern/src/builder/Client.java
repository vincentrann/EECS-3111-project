package builder;

public class Client {
	String type;
	String email;
	String password;
	String userID;
	
	public Client(String type, String email, String password, String userID) {
		this.type = type;
		this.email = email;
		this.password = password;
		this.userID = userID;
	}
	
	@Override
	public String toString() {
		return "Client{" + "type=" + type + '\\' + "email=" + email + '\\' + "password=" + password + '\\' + "userID=" + userID + "}";
	}
}



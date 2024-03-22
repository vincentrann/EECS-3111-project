package Models;

import BuilderPattern.ClientDirector;
import BuilderPattern.VisitorBuilder;

public class Visitor {
	private ClientDirector visitorDirector;
	
	public Visitor(String email, String password, String userID) {
		this.visitorDirector = new ClientDirector(new VisitorBuilder());
		this.visitorDirector.construct(email, password, userID);
	}
	
	public Client getClient() {
		return this.visitorDirector.getProduct(); 
	}

}

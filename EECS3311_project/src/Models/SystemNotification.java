package Models;

public class SystemNotification {
	
	private static SystemNotification instance;
	
	public SystemNotification getInstance() {
		if(instance == null){
			this.instance = new SystemNotification();
		}
		return this.instance;
	}

	public String returnWarning() {
		// TODO Auto-generated method stub
		return null;
	}
	//implement functions

	public String newTextbook() {
		// TODO Auto-generated method stub
		return null;
	}

	public String unavailableTextbook() {
		// TODO Auto-generated method stub
		return null;
	}

	public String priority() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String registrationFailed() {
		return null;
	}


}

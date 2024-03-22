package Models;

public class SystemNotification {
	
	private static SystemNotification instance;
	
	public static SystemNotification getInstance() {
		if(instance == null){
			instance = new SystemNotification();
		}
		return instance;
	}
	
	private SystemNotification() {}

	public String returnWarning() {
		return null;
	}
	//implement functions

	public String newTextbook() {
		return null;
	}

	public String unavailableTextbook() {
		return null;
	}

	public String priority() {
		return null;
	}
	
	public String registrationFailed() {
		return null;
	}


}

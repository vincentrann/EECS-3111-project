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


	public String unavailableTextbook() {
		return "Procuring book if possible";
	}
	
	public String registrationFailed() {
		return null;
	}


}

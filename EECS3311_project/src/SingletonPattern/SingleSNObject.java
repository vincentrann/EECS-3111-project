package SingletonPattern;

import Models.SystemNotification;

public class SingleSNObject {
	
	private static SystemNotification instance;
	
	public static SystemNotification getInstance() {
		if(instance == null) {
			instance = new SystemNotification();
		}
		return instance;
	}
	
	public String returnWarning() {
		return systemNotification.returnWarning();
	}
	
	public String newTextbook() {
		return systemNotification.newTextbook();
	}
	
	public String unavailableTextbook() {
		return systemNotification.unavailableTextbook();
	}
	
	public String priority() {
		return systemNotification.priority();
	}
	
	
	public String registrationFailed() {
		return systemNotification.registrationFailed();
	}

}

package SingletonPattern;

import Models.SystemNotification;

public class SingleSNObject {
	
	private static SingleSNObject instance;
	private SystemNotification systemNotification;
	
	public static SingleSNObject getInstance() {
		if(instance == null) {
			instance = new SingleSNObject();
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

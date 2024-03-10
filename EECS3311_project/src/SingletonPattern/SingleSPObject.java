package SingletonPattern;

import Models.Newsletter;
import Models.PhysicalItem;
import Models.SystemPayment;

public class SingleSPObject {
	private static SingleSPObject instance;
	private SystemPayment systemPayment;
	
	public static SingleSPObject getInstance() {
		if(instance == null) {
			instance = new SingleSPObject();
		}
		return instance;
	}
	
	public SystemPayment getSystemPayment() {
		return systemPayment;
	}
	
	public void subscribe(Newsletter newsletter) {
		this.systemPayment.subscribe(newsletter);
	}
	
	public void discount(PhysicalItem item) {
		this.systemPayment.discount(item);
	}
	
	public void payment(String type) {
		this.systemPayment.payment(type);
	}
	

}

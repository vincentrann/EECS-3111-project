package SingletonPattern;

import Models.*;

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
	
	public void subscribe(Client client, Newsletter newsletter) {
		this.systemPayment.subscribe(client, newsletter);
	}
	
	public void discount(PhysicalItem item) {
		this.systemPayment.discount(item);
	}
	
	public void payment(String type) {
		this.systemPayment.payment(type);
	}
	

}

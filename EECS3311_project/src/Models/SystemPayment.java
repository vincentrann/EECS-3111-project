package Models;

public class SystemPayment {
	private String paymentType;
	private int paymentId;
	private static int idCounter = 0;
	private static SystemPayment instance;
	
	public static SystemPayment getInstance() {
		if(instance == null){
			instance = new SystemPayment();
		}
		return instance;
	}
	
	private SystemPayment() {}
	
	public SystemPayment(String paymentType) {
		this.paymentType = paymentType;
		this.paymentId = idCounter;
		idCounter++;
	}

	public void subscribe(Client client, Newsletter newsletter) {
		client.subscribe(newsletter);
	}

	public void discount(PhysicalItem item) {
		
		
	}

	public void payment(String type) {
		
		
	}


}

package Models;

public class SystemPayment {
	private String paymentType;
	private int paymentId;
	private static int idCounter = 0;
	
	public SystemPayment() {}
	
	public SystemPayment(String paymentType) {
		this.paymentType = paymentType;
		this.paymentId = idCounter;
		idCounter++;
	}

	public void subscribe(Newsletter newsletter) {
		// TODO Auto-generated method stub
		
	}

	public void discount(PhysicalItem item) {
		// TODO Auto-generated method stub
		
	}

	public void payment(String type) {
		// TODO Auto-generated method stub
		
	}


}

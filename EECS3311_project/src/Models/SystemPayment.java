package Models;

public class SystemPayment {
	private String paymentType;
	private String paymentId;
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
		//this.paymentId = idCounter;
		//idCounter++;
	}

	public void subscribe(Client client, Newsletter newsletter) {
		client.subscribe(newsletter);
	}

	public void discount(PhysicalItem item) {
		
		
	}

	public String payment(String type, double amount, String paymentId) {
	    // Implementing payment logic based on the type
		this.paymentType = type;
		this.paymentId = paymentId;
	    String paymentMessage = "";
	    switch (this.paymentType.toLowerCase()) {
	        case "credit":
	            // Process credit payment
	            paymentMessage = "Credit payment of $" + amount + " completed.";
	            break;
	        case "debit":
	            // Process debit payment
	            paymentMessage = "Debit payment of $" + amount + " completed.";
	            break;
	        case "mobile wallet":
	            // Process mobile wallet payment
	            paymentMessage = "Mobile wallet payment of $" + amount + " completed.";
	            break;
	        default:
	            // Unrecognized payment type
	            paymentMessage = "Payment type unrecognized. Transaction aborted.";
	            break;
	    }
	    return paymentMessage + " Payment ID: " + paymentId;
	}


}

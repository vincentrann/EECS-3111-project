package Models;

public class BookRequest {
	private String requestedBook;
	private String requestMessage;
	private String requestPriority;
	
	public BookRequest(String requestedBook, String requestMessage, String requestPriority ) {
		this.requestedBook = requestedBook;
		this.requestMessage = requestMessage;
		this.requestPriority = requestPriority;
	}

	public String getRequestedBook() {
		return this.requestedBook;
	}
	
	public String getRequestedMessage() {
		return this.requestMessage;
	}
	
	public String getRequestPriority() {
		return this.requestPriority;
	}
	
}
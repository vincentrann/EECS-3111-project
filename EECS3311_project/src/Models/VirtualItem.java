package Models;//package ...

public class VirtualItem extends Item{
	private String text;
	private int priority; 
	// attributes for textbook
    private String edition;
    boolean availability;
    
    // priority is lower for books
    public VirtualItem(String name){
    	this.setName(name);
    	this.setType("virtual");
    	this.edition = "";
    	this.availability = true;
    	this.priority = 1;
    }
    
    //priority is higher for textbooks
    public VirtualItem(String name, String edition, boolean availability){
    	this.setName(name);
    	this.setType("virtual");
        this.edition = edition;
        this.availability = availability;
        this.priority = 2;
    }
    
    public void addText(String text) {
    	this.text = text;
    }
    
    public String getContent() {
    	return text;
    }
}
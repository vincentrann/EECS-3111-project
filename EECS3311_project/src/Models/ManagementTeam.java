package Models;

import java.util.Random;

public class ManagementTeam{
    public ManagementTeam() {}

    public boolean furthervalidation(){
    	Random random = new Random();
        int randomNumber = random.nextInt(100);
        int failureThreshold = 5;
        boolean validation = randomNumber < failureThreshold;

        if (validation) {
            return false;
        } else {
            return true;
        }
        
    }

    public void procureBook(PhysicalItem item) {
    	if(item.getCopies() < 20) {
    		addItem(item);
    	}
	}
    
//	public void changeItem(Item item) {
//		//update item in csv(?)
//	}
	
	private void addItem(PhysicalItem item) {
		item.addCopy();
	}
	
	public void enableItem(Item item) {
		item.enable();
	}
	
	public void disableItem(Item item) {
		item.disable();
	}
}
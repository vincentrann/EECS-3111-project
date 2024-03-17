package Models;

import java.util.Random;

public class ManagementTeam{
	private static ManagementTeam instance;
    private ManagementTeam() {}

    public boolean furtherValidation(){
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
    
    //USE THIS WHEN INSTANTIATING OR USING METHODS
    
    public static ManagementTeam getInstance() {
    	if(instance == null) {
    		instance = new ManagementTeam();
    	}
    	return instance;
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
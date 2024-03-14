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

    public void pocureBook(String book) {
    	System.out.println("hello");
	}
    
    public void changeItems(Item item){}



	public void changeItem(Item item) {
		
		// TODO Auto-generated method stub
		
	}
}
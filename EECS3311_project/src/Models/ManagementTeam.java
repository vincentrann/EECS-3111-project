package Models;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import com.opencsv.exceptions.CsvValidationException;

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

    /*
     * Increase the number of copies for book
     */
    public void procureBook(PhysicalItem item) {
    	if(item.getCopies() < 20) {
    		increaseCopy(item);
    	}
	}

	private void increaseCopy(PhysicalItem item) {
		item.addCopy();
	}
	
	
	/*
	 * Adds the item to the database
	 */
	public void addItem(Item item, String location) {
		try {
			SystemDatabase.getInstance().addPhysicalItem(item.getName(), location);
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	/*
	 * Enable the item for rent
	 */
	public void enableItem(Item item) {
		item.enable();
	}
	
	/*
	 * Disable the item for rent
	 */
	public void disableItem(Item item) {
		item.disable();
	}
}

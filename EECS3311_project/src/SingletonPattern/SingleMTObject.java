package SingletonPattern;

import Models.Item;
import Models.ManagementTeam;
import Models.PhysicalItem;

public class SingleMTObject{
    private static SingleMTObject instance;
    
    public static ManagementTeam getInstance() {
    	if(instance == null) {
    		instance = new ManagementTeam();
    	}
    	return instance;
    }
    
    public boolean furtherValidation() {
    	return this.managementTeam.furthervalidation();
    }
    
    public void procureBook(PhysicalItem item) {
    	this.managementTeam.procureBook(item);
    }
    
//    public void changeItem(Item item) {
//    	this.managementTeam.changeItem(item);
//    }
    
    public void enableItem(Item item) {
    	this.managementTeam.enableItem(item);
    }
    
    public void disableItem(Item item) {
    	this.managementTeam.disableItem(item);
    }
}
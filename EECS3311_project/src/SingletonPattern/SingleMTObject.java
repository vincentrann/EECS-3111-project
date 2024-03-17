package SingletonPattern;

import Models.Item;
import Models.ManagementTeam;
import Models.PhysicalItem;

public class SingleMTObject{
    private static SingleMTObject instance;
    
    private ManagementTeam managementTeam;
    
    private SingleMTObject() {
    	this.managementTeam = new ManagementTeam();
    }
    
    public static SingleMTObject getInstance() {
    	if(instance == null) {
    		instance = new SingleMTObject();
    	}
    	return instance;
    }
    
    public ManagementTeam getManagementTeam() {
    	return managementTeam;
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
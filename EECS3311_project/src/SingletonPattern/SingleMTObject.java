package SingletonPattern;

import Models.Item;
import Models.ManagementTeam;

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
    
    public void pocureBook(String book) {
    	this.managementTeam.pocureBook(book);
    }
    
    public void changeItem(Item item) {
    	this.managementTeam.changeItem(item);
    }
}
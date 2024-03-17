package Models;

import BridgePattern.ConcreteItem;

public class Item extends ConcreteItem{
    private String name;
    private String uniqueID; //updated uniqueID to be String to be consistent with userID
    private String typeOfItem;
    private boolean enabled = true;

    private void /*String instead of void*/ getName(String uniqueID){
        //if exists in database return String
        //else return error not-existing message
    }
    
    protected void enable() {
    	enabled = true;
    }
    
    protected void disable() {
    	enabled = false;
    }
    
    protected boolean isEnabled() {
    	return enabled;
    }
   
}
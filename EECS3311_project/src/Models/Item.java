package Models;

import BridgePattern.ConcreteItem;

public class Item extends ConcreteItem{
    private String name;
    private String typeOfItem;
    private boolean enabled = true;
    
    protected void enable() {
    	enabled = true;
    }
    
    protected void disable() {
    	enabled = false;
    }
    
    protected boolean isEnabled() {
    	return enabled;
    }
    
    public String getName() {
		return this.name;
	}
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getType() {
    	return typeOfItem;
    }
    
    public void setType(String type) {
    	this.typeOfItem = type;
    }
    
}
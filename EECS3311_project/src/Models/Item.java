package Models;

import Bridge_Factory_Pattern.ConcreteItem;

public class Item extends ConcreteItem{
    private String name;
    private String typeOfItem;
    
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
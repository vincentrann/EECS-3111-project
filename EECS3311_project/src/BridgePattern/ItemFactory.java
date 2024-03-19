package BridgePattern;

import Models.Item;
import Models.PhysicalItem;
import Models.VirtualItem;

public class ItemFactory {
    
    public ClientItem getVirtualItem(int uniqueID, String name, String typeOfItem,int copies, String library, boolean canBe) {
        return new ClientItem (new ConcretePhysicalItem(uniqueID, name, typeOfItem, copies, library, canBe));
    }


    public ClientItem getPhysicalItem(int uniqueID, String name, String typeOfItem,String edition, boolean availability, double priority ){
        return  new ClientItem(new ConcreteVirtualTextbook(uniqueID, name, typeOfItem, edition, availability, priority));
    }

    public static Item getItem(String name, String type, String id, int copies, String library, boolean canBe, String edition, boolean availability) {
    	Item item;
    	if (type.equals("virtual book")) {
    		item = new VirtualItem(name);
    	}
    	else if (type.equals("virtual textbook")) {
    		item = new VirtualItem(name, edition, availability);
    	}
    	else {
    		item = new PhysicalItem(name, id, copies, library, canBe);
    	}
    	return item;
    	
    }
    
}

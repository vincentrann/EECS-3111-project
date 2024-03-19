package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

import Models.PhysicalItem;

public class PhysicalItemFactory{
    private static final Map<String, PhysicalItem> physicalItemsMap = new HashMap<String, PhysicalItem>();

    public static PhysicalItem getPhysicalItem(String name, String id, int copies, String library, boolean canBe){ // should only be id, can have up to 20 copies so name is repeated
        String keyString = id;
        PhysicalItem item = physicalItemsMap.get(keyString);
        
        if (item != null) {
        	return item;
        }
        else {
        	item = new PhysicalItem(name, id, copies, library, canBe);
        }
        physicalItemsMap.put(keyString, item);
        return item;
    }
    
}
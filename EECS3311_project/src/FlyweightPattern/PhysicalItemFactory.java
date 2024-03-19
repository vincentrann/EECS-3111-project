package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

import BridgePattern.ItemFactory;
import Models.PhysicalItem;

public class PhysicalItemFactory{
    private static final Map<String, PhysicalItem> physicalItemsMap = new HashMap<String, PhysicalItem>();

    public static PhysicalItem getPhysicalItem(String name, String id, int copies, String library, boolean canBe){ 
        String keyString = name;
        PhysicalItem item = physicalItemsMap.get(keyString);
        
        if (item != null) {
        	return item;
        }
        else {
        	item = (PhysicalItem) ItemFactory.getItem(name, "physical", id, copies, library, canBe, "", false);
        }
        physicalItemsMap.put(keyString, item);
        return item;
    }
    
}
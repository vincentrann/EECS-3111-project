package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;
import Models.Newsletter;
import Models.PhysicalItem;
import Models.SystemDatabase;

public class PhysicalItemFactory{
    private static Map<String, PhysicalItem> physicalItemsMap;

    private PhysicalItemFactory(){
        this.physicalItemsMap = new HashMap<String, PhysicalItem>();
    }

    public static PhysicalItem getPhysicalItem(String name){ //should be itemID or name but works either way just adjust systemdatabasemethods
        PhysicalItem existingItem = physicalItemsMap.get(name);
        if(existingItem != null) {
            return existingItem;
        }
        else{
            PhysicalItem getItem = PhysicalItemFromDatabase(name); // retrieve item from database
            physicalItemsMap.put(name, getItem);
            return getItem;
        }
    }
    
    private static PhysicalItem PhysicalItemFromDatabase(String name) { 
    	return SystemDatabase.getInstance().getPhysicalItem(name);
    }
}
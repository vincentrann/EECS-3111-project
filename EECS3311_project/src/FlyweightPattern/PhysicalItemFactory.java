package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;
import Models.PhysicalItem;

public class PhysicalItemFactory{
    private static Map<String, PhysicalItem> physicalItemsMap;

    private PhysicalItemFactory(){
        this.physicalItemsMap = new HashMap<String, PhysicalItem>();
    }

    public static PhysicalItem getPhysicalItem(String name){
        PhysicalItem existingItem = physicalItemsMap.get(name);
        if(existingItem != null) {
            return existingItem;
        }
        else{
            PhysicalItem getItem = null; //= retrive item from database
            physicalItemsMap.put(name, getItem);
            return getItem;
        }
    }
}
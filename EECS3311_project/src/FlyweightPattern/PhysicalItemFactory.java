package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;
import Models.PhysicalItem;

public class PhysicalItemFactory{
    private Map<String, PhysicalItem> physicalItemsMap;

    public PhysicalItemFactory(){
        this.physicalItemsMap = new HashMap<String, PhysicalItem>();
    }

    public PhysicalItem getPhysicalItem(String name){
        PhysicalItem existingItem = this.physicalItemsMap.get(name);
        if(existingItem != null) {
            return existingItem;
        }
        else{
            PhysicalItem getItem = null; //= retrive item from database
            this.physicalItemsMap.put(name, getItem);
            return getItem;
        }
    }
}
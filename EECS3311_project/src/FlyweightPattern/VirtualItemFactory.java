package FlyweightPattern;


import Models.PhysicalItem;
import Models.SystemDatabase;
import Models.VirtualTextbook;

import java.util.HashMap;
import java.util.Map;

public class VirtualItemFactory {
    private static Map<String, VirtualTextbook> virtualItemsMap;

    private VirtualItemFactory(){
        this.virtualItemsMap = new HashMap<String, VirtualTextbook>();
    }

    public static VirtualTextbook getVirtualItem(String name){
        VirtualTextbook existingItem = virtualItemsMap.get(name);

        if(existingItem != null){
            return existingItem;
        }
        else{
            VirtualTextbook newTextbook = CreateVirtualTextbookFromDatabase(name); //get textbook from database
            virtualItemsMap.put(name, newTextbook);
            return newTextbook;
        }
    }
    
    private static VirtualTextbook CreateVirtualTextbookFromDatabase(String name) { 
    	return SystemDatabase.getInstance().getVirtualTextbook(name);
    }
}

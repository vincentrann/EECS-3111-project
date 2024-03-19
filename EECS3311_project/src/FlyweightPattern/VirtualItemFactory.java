package FlyweightPattern;


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
            VirtualTextbook newTextbook = null; //get textbook from database
            virtualItemsMap.put(name, newTextbook);
            return newTextbook;
        }
    }
    
}

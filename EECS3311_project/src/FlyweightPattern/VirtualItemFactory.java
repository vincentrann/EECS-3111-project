package FlyweightPattern;


import Models.VirtualTextbook;

import java.util.HashMap;
import java.util.Map;

public class VirtualItemFactory {
    private Map<String, VirtualTextbook> virtualItemsMap;

    public VirtualItemFactory(){
        this.virtualItemsMap = new HashMap<String, VirtualTextbook>();
    }

    public VirtualTextbook getVirtualItem(String name){
        VirtualTextbook existingItem = this.virtualItemsMap.get(name);

        if(existingItem != null){
            return existingItem;
        }
        else{
            VirtualTextbook newTextbook = null; //get textbook from database
            this.virtualItemsMap.put(name, newTextbook);
            return newTextbook;
        }
    }
}

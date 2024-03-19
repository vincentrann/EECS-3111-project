package FlyweightPattern;


import java.util.HashMap;
import java.util.Map;

import BridgePattern.ItemFactory;
import Models.VirtualItem;

public class VirtualItemFactory {
    private static final Map<String, VirtualItem> virtualItemsMap = new HashMap<String, VirtualItem>();

    public static VirtualItem getVirtualBook(String name, String edition, boolean availability){
        String key = name;
        VirtualItem item = virtualItemsMap.get(key);
        
        if (item != null) {
        	return item;
        }
        else {
        	if(edition.equals("")) { //indicates its a book, create book
        		item = (VirtualItem) ItemFactory.getItem(name, "virtual book", "", 0, "", false, edition, availability);
        	}
        	else { //indicates textbook, create textbook
        		item = (VirtualItem) ItemFactory.getItem(name, "virtual textbook", "", 0, "", false, edition, availability);;
        	}
        }
        virtualItemsMap.put(key, item);
        return item;
    }
    
    
}

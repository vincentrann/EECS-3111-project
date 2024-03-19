package FlyweightPattern;


import java.util.HashMap;
import java.util.Map;

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
        		item = new VirtualItem(name);
        	}
        	else { //indicates textbook, create textbook
        		item = new VirtualItem(name, edition, availability);
        	}
        }
        virtualItemsMap.put(key, item);
        return item;
    }
    
    
}

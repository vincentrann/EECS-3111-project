package FlyweightPattern;


import Models.Newsletter;
import Models.VirtualTextbook;

import java.util.HashMap;
import java.util.Map;

public class NewsletterFactory {
    private Map<String, Newsletter> newsletterMap;

    public NewsletterFactory(){
        this.newsletterMap = new HashMap<String, Newsletter>();
    }

    public Newsletter getVirtualItem(String name){
        Newsletter existingItem = this.newsletterMap.get(name);

        if(existingItem != null){
            return existingItem;
        }
        else{
            Newsletter newTextbook = null; //get textbook from database
            this.newsletterMap.put(name, newTextbook);
            return newTextbook;
        }
    }
}

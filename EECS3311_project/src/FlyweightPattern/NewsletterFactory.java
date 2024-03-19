package FlyweightPattern;


import Models.Newsletter;
import Models.VirtualTextbook;

import java.util.HashMap;
import java.util.Map;

public class NewsletterFactory {
    private static Map<String, Newsletter> newsletterMap;

    private NewsletterFactory(){
        this.newsletterMap = new HashMap<String, Newsletter>();
    }

    public static Newsletter getNewsletter(String name){
        Newsletter existingItem = newsletterMap.get(name);

        if(existingItem != null){
            return existingItem;
        }
        else{
            Newsletter newTextbook = null; //get textbook from database
            newsletterMap.put(name, newTextbook);
            return newTextbook;
        }
    }
    
}

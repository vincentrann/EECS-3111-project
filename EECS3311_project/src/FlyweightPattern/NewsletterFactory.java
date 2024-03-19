package FlyweightPattern;


import java.util.HashMap;
import java.util.Map;

import Models.Newsletter;

public class NewsletterFactory {
    private static final Map<String, Newsletter> newsletterMap = new HashMap<String, Newsletter>();

    public static Newsletter getNewsletter(String name, String url){
        String keyString = name;
        Newsletter letter = newsletterMap.get(keyString);
        
        if (letter != null) {
        	return letter;
        }
        else {
        	letter = new Newsletter(name, url);
        }
        newsletterMap.put(keyString, letter);
        return letter;
    }
    
}

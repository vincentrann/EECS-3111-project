package Models;//package ...

import java.util.List;

public class Newsletter{
    private String name;
    private String url;
    


    public Newsletter(){}

    public Newsletter(String name, String url){
        this.name = name;
        this.url = url;
    }
    
    public String getName() {
    	return name;
    }
    
    public String url() {
    	return this.url;
    }
   
    
    public void addSubscription(String userID, Newsletter newsletter) {
    	SystemDatabase.getInstance().addSubscription(userID, newsletter);
    }
    public void cancelSubscription(String userID, Newsletter newsletter) {
    	SystemDatabase.getInstance().cancelSubscription(userID, newsletter);
    }
    public List<Newsletter> viewAvailableNewsletters(String userID) {
    	return SystemDatabase.getInstance().viewAvailableNewsletters(userID);
    }
    public double getMonthlyCost(String uniqueID) {
    	return SystemDatabase.getInstance().getMonthlyCost(uniqueID);
    }

	public String getUrl() {
		return this.url;
	}
}
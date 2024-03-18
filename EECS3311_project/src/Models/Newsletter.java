package Models;//package ...

import java.util.List;

public class Newsletter{
    private String name;
    private String uniqueId;
    private double discount;
    private int monthlyCost;
    


    public Newsletter(){}

    public Newsletter(String name, String uniqueId, double discount, int monthlyCost){
        this.name = name;
        this.uniqueId = uniqueId;
        this.discount = discount;
        this.monthlyCost = monthlyCost;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getUniqueId() {
    	return this.uniqueId;
    }
    
    public int getMonthlyCost() {
    	return this.monthlyCost;
    }
    
    public double getDiscount() {
    	return this.discount;
    }
    
    public void addSubscription(String userID, String uniqueID) {
    	SystemDatabase.getInstance().addSubscription(userID, uniqueID);
    }
    public void cancelSubscription(String userID, String uniqueID) {
    	SystemDatabase.getInstance().cancelSubscription(userID, uniqueID);
    }
    public List<String> viewAvailableNewsletters(String userID) {
    	return SystemDatabase.getInstance().viewAvailableNewsletters(userID);
    }
    public double getMonthlyCost(String uniqueID) {
    	return SystemDatabase.getInstance().getMonthlyCost(uniqueID);
    }
}
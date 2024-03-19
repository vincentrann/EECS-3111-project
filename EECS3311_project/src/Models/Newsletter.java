package Models;//package ...

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.exceptions.CsvValidationException;

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
    public void cancelSubscription(String userID, Newsletter newsletter) throws CsvValidationException {
    	SystemDatabase.getInstance().cancelSubscription(userID, newsletter);
    }
    public List<Newsletter> viewAvailableNewsletters(String userID) throws CsvValidationException {
    	return SystemDatabase.getInstance().viewAvailableNewsletters(userID);
    }
    public double getMonthlyCost(String uniqueID) throws CsvValidationException, NumberFormatException {
    	return SystemDatabase.getInstance().getMonthlyCost(uniqueID);
    }

	public String getUrl() {
		return this.url;
	}
	
}
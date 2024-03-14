package Models;//package ...

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
}
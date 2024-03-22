package Bridge_Factory_Pattern;



public class ConcreteVirtualTextbook extends ConcreteItem{
    private String edition;
    private boolean availability;
    private double priority;

    public ConcreteVirtualTextbook(){

    }

    public ConcreteVirtualTextbook(String edition, boolean availability, double priority){
        this.edition = edition;
        this.availability = availability;
        this.priority = priority;
    }

    public ConcreteVirtualTextbook(int uniqueID, String name, String typeOfItem, String edition, boolean availability, double priority){
        super(uniqueID, name, typeOfItem);
        this.edition = edition;
        this.availability = availability;
        this.priority = priority;
    }
}
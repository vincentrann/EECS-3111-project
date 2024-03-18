package Models;//package ...

public class VirtualTextbook extends Item{
    private String edition;
    private boolean availability;
    private double priority;

    public VirtualTextbook(){

    }

    public VirtualTextbook(String edition, boolean availability, double priority){
        this.edition = edition;
        this.availability = availability;
        this.priority = priority;
    }
}
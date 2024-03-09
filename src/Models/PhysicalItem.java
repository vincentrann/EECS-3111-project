package Models;// package ...

public class PhysicalItem{
    private int copies;
    private String borrowedDate;
    private String locationInLibrary;
    private boolean canBePurchased;

    public PhysicalItem(){

    }

    public PhysicalItem(int copies, String borrowedDate, String library, boolean canBe){
        this.copies = copies;
        this.borrowedDate = borrowedDate;
        this.locationInLibrary = library;
        this.canBePurchased = canBe;
    }

    public String getLocation(){
        return this.locationInLibrary;
    }
}
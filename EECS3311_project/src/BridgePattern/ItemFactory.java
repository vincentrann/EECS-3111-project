package BridgePattern;

public class ItemFactory {
    
    public ClientItem getVirtualItem(int uniqueID, String name, String typeOfItem,int copies, String library, boolean canBe) {
        return new ClientItem (new ConcretePhysicalItem(uniqueID, name, typeOfItem, copies, library, canBe));
    }

    

    public ClientItem getPhysicalItem(int uniqueID, String name, String typeOfItem,String edition, boolean availability, double priority ){
        return  new ClientItem(new ConcreteVirtualTextbook(uniqueID, name, typeOfItem, edition, availability, priority));
    }

    
}

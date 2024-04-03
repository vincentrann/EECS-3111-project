package Bridge_Factory_Pattern;


public  class ClientItem{

    private ConcreteItem item;

    public ClientItem(ConcreteItem item){
        this.item = item;
    }

    public String getName(){
        return item.getConcreteName();
    }
    public int getUniqueID(){
        return item.getConcreteUniqueID();
    }
    public String getType(){
        return item.getConcreteType();
    }

    public void changeItemName(String newName) {
        item.changeName(newName);
    }

    public void changeItemType(String newType) {
        item.changeType(newType);
    }
}
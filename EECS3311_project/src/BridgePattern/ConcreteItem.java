package BridgePattern;


public class ConcreteItem{
    private int uniqueID;
    private String name;
    private String typeOfItem;

    public ConcreteItem(int uniqueID, String name, String typeOfItem){
        this.uniqueID = uniqueID;
        this.name = name;
        this.typeOfItem = typeOfItem;
    }

    public ConcreteItem(){
        
    }

    protected String getConcreteName(){
        return name;
    }
    protected int getConcreteUniqueID(){
        return uniqueID;
    }
    protected String getConcreteType(){
        return this.typeOfItem;
    }
    protected void changeName(String name){
        this.name = name;
    }
    protected void changeType(String type){
        this.typeOfItem = type;
    }
}  
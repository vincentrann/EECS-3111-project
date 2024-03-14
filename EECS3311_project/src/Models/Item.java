package Models;

public class Item {
    private String name;
    private String uniqueID; //updated uniqueID to be String to be consistent with userID
    private String typeOfItem;

    private void /*String instead of void*/ getName(String uniqueID){
        //if exists in database return String
        //else return error not-existing message
    }
}
package Models;

public class TextbookInfo {
    private String textbook;
    private String edition;

    public TextbookInfo(String textbook, String edition) {
        this.textbook = textbook;
        this.edition = edition;
    }

    public String getTextbook() {
        return textbook;
    }

    public String getEdition() {
        return edition;
    }
    
    public boolean newEdition(TextbookInfo textbook) {
    	if(textbook.getTextbook() == this.textbook && textbook.getEdition() == this.edition) {
    		return false;
    	}
    	else if(textbook.getTextbook() == this.textbook) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
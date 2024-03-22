package Models;

public class TextbookInfo {
    private String textbook;
    private int edition;

    public TextbookInfo(String textbook, String edition) {
        this.textbook = textbook;
        this.edition = Integer.parseInt(edition);
    }

    public String getTextbook() {
        return textbook;
    }

    public int getEdition() {
        return edition;
    }
    
    public boolean newEdition(TextbookInfo textbook) {
    	if(textbook.getTextbook().equals(this.textbook) && textbook.getEdition() == this.edition) {
    		return false;
    	}
    	else if(textbook.getTextbook().equals(this.textbook) && this.edition < textbook.getEdition()) {
    		System.out.println("true");
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
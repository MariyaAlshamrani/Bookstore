//Add to git hub 

package phasetwo;
import java.io.*;        

public abstract class Book implements Serializable {
    protected String title;
	    protected String author;
	    protected boolean isBorrowed;

	    public Book(String title, String author, boolean isBorrowed) {
	        this.title = title;
	        this.author = author;
	        this.isBorrowed = isBorrowed;
	    }
	    public void setBorrowed(boolean isBorrowed) {
	        this.isBorrowed = isBorrowed;
	    }
	    public abstract void printType(); 

	    public abstract String display(); 

	    
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isBorrowed() {
	        return isBorrowed;
	    }
// exception we made 
	    public static class BookNotFoundException extends Exception {
	        public BookNotFoundException(String message) {
	            super(message);
	        }

}
}

package phasetwo;


public class Novel extends Book {
    protected String genre;

    public Novel(String title, String author, boolean isBorrowed, String genre) {
        super(title, author, isBorrowed);
        this.genre = genre;
    }

    
    public void printType() {
        System.out.println("This is a Novel.");
    }

    
    public String display() {
        return ("Novel - Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

    
    public String getGenre() {
        return genre;
    }
}

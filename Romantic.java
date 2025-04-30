
package phasetwo;

public class Romantic extends Novel  {
      private boolean happyEnding;

    public Romantic(String title, String author, boolean isBorrowed, boolean happyEnding) {
        super(title, author, isBorrowed, "Romance");
        this.happyEnding = happyEnding;
    }

    
    public void printType() {
        System.out.println("This is a Romantic Novel.");
    }

    
    public String display() {
        return ("Romantic Novel - Title: " + title + ", Author: " + author +
                ", Happy Ending: " + (happyEnding ? "Yes" : "No") +
                ", Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

   
    public boolean isHappyEnding() {
        return happyEnding;
    }
}

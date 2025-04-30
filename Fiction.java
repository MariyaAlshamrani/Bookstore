
package phasetwo;


public class Fiction extends Novel {

    private String worldName;

    public Fiction(String title, String author, boolean isBorrowed, String worldName) {
        super(title, author, isBorrowed, "Fiction");
        this.worldName = worldName;
    }

    
    public void printType() {
        System.out.println("This is a Fiction Novel.");
    }

  
    public String display() {
        return("Fiction Novel - Title: " + title + ", Author: " + author +
                ", World: " + worldName + ", Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

    public String getWorldName() {
        return worldName;
    }


}
    

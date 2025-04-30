
package phasetwo;
import java.io.*;
import java.util.List;

public class Librarian implements Serializable {
    private String name; 
	private int id;
	
	public Librarian(String name , int id) {
		this.name= name;
		this.id=id;
	}
	public boolean addBook(Book b, Library l) {
        if (b == null || l == null) return false;
        l.addBook(b);
        return true;
    }
		

	public boolean removeBook(String title, Library l) {
        if (title == null || l == null) return false;
        return l.removeBook(title); 
       
	   
	}

	
	public Member searchMember(int id, Library l) {
        if (l == null) return null;
        return l.searchMember(id); // calls LinkedList-based search
    }
    		

	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
}

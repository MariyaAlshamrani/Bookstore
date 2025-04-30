
package phasetwo;
import java.io.*;
import java.util.List;

public class Member implements Serializable {
    private String name;
    private int memberid;
    private Book[] borrowedBooks;
    private int borrowedCount;

    public Member(String name, int memberid, int maxBooks) {
        this.name = name;
        this.memberid = memberid;
       borrowedBooks = new Book[maxBooks];  
       borrowedCount++;
    }

    public String getName() {
        return name;
    }

    public int getmemberID() {
        return memberid;
    }

    public void borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount++] = book;
        } else {
            System.out.println("You already borrowed alots  books!");
        }
    }

   
  public void returnBook(Book book) {
     for (int i = 0; i < borrowedCount; i++) {
          if (borrowedBooks[i] == book) {
        
         for (int j = i; j < borrowedCount - 1; j++) {
        borrowedBooks[j] = borrowedBooks[j + 1];
         }
         borrowedBooks[--borrowedCount] = null;
         
      }
     }
   System.out.println("This book was not borrowed by you!");
    }

  public String showBorrowedBooks() {
	   /* return(name + "'s Borrowed Books:");

	    boolean hasBooks = false; 
	    for (int i = 0; i < borrowedCount; i++) {
	        if (borrowedBooks[i] != null) { 
	            return("- " + borrowedBooks[i].getTitle());
	            hasBooks = true;
	        }
	    }

	    if (!hasBooks) {
	        return(" No borrowed books found.");
	    }*/
    String result = name + "'s Borrowed Books:\n";
    boolean hasBooks = false;

    for (int i = 0; i < borrowedCount; i++) {
        if (borrowedBooks[i] != null) {
            result += "- " + borrowedBooks[i].getTitle() + "\n";
            hasBooks = true;
        }
    }

    if (!hasBooks) {
        return name + " has no borrowed books.";
    }

    return result;
}


	}




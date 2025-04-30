
package phasetwo;
import java.util.Scanner;

public class BookStore {
             static Library library = new Library( "Ahmad", 1001);
static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) { 


        boolean running = true;

        while (running) {
            System.out.println("\n📚 Welcome to NextGen Library 📚");
            System.out.println("1. Add Book"); //M**********done
            System.out.println("2. Remove Book"); //M**********dodne
            System.out.println("3. Search Book"); //M************done
            System.out.println("4. Register Member"); //L*************done
            System.out.println("5. Borrow Book"); //M***********done
            System.out.println("6. Return Book"); //M************done
            System.out.println("7. Display Available Books"); //L***********done
            System.out.println("8. Search Member"); //L***********done
            System.out.println("9. Show Borrowed Books"); //M
            System.out.println("10. Show Book Type"); //M
            System.out.println("11. Show Librarian Name"); //L********done
            System.out.println("12. Exit");
            System.out.print("Your choice: ");
            
            
 //***************************************************
 //***************************************************
 firstFrame frame = new firstFrame();
 frame.setVisible(true);
 
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: 
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.println("Choose book category:");
                    System.out.println("1. Fiction");
                    System.out.println("2. Novel");
                    System.out.println("3. Romantic");
                    System.out.println("4. Study Book");
                    System.out.print("Your choice: ");

                    int bookType = scanner.nextInt();
                    scanner.nextLine();

                    Book newBook;
                    if (bookType == 1) {
                        System.out.print("Enter world name for Fiction: ");
                        String worldName = scanner.nextLine();
                        newBook = new Fiction(title, author, false, worldName);
                    } else if (bookType == 2) {
                        System.out.print("Enter genre for Novel: ");
                        String genre = scanner.nextLine();
                        newBook = new Novel(title, author, false, genre);
                    } else if (bookType == 3) {
                        System.out.print("Does it have a happy ending? (true/false): ");
                        boolean happyEnding = scanner.nextBoolean();
                        scanner.nextLine();
                        newBook = new Romantic(title, author, false, happyEnding);
                    } else {
                        System.out.print("Enter subject for Study Book: ");
                        String subject = scanner.nextLine();
                        System.out.print("Enter grade level: ");
                        String gradeLevel = scanner.nextLine();
                        newBook = new StudyBook(title, author, false, subject, gradeLevel);
                    }

                    library.addBook(newBook); //L
                    System.out.println(" Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    boolean removed = library.removeBook(removeTitle); //L
                    System.out.println(removed ? " Book removed!" : " Book not found.");
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBook(searchTitle); //L
                    if (foundBook != null) {
                        foundBook.display();
                    } else {
                        System.out.println(" Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberID = scanner.nextInt();
                    scanner.nextLine();

                    Member newMember = new Member(memberName, memberID, 5); //L
                    if (library.registerMember(newMember)) {
                        System.out.println("Member '" + memberName + "' registered successfully!");
                    } else {
                        System.out.println(" Registration failed! The library might be full.");
                    }
                    break;

                case 5:
                    System.out.print("Enter your member ID: ");
                    int borrowID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowID, borrowTitle); //L
                    break;

                case 6:
                    System.out.print("Enter your member ID: ");
                    int returnID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnID, returnTitle); //L
                    break;

                case 7:
                    library.listAvailableBooks(); //L
                    break;

                case 8:
                    System.out.print("Enter member ID to search: ");
                    int searchMemberID = scanner.nextInt();
                    scanner.nextLine();

                    Member foundMember = library.searchMember(searchMemberID); //L
                    if (foundMember != null) {
                        System.out.println(" Member found: " + foundMember.getName());
                    } else {
                        System.out.println(" Member not found.");
                    }
                    break;

                case 9:
                    System.out.print("Enter your member ID: ");
                    int memberIDToCheck = scanner.nextInt();
                    scanner.nextLine();

                    Member memberToCheck = library.searchMember(memberIDToCheck); //L
                    if (memberToCheck != null) {
                        memberToCheck.showBorrowedBooks();
                    } else {
                        System.out.println(" Member not found.");
                    }
                    break;

                case 10:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();

                    Book bookToCheck = library.searchBook(bookTitle); //L
                    if (bookToCheck != null) {
                        bookToCheck.printType();
                    } else {
                        System.out.println(" Book not found.");
                    }
                    break;

                case 11:
                    System.out.println("Current Librarian: " +  library.getLibrarian().getName() );  //L
                    break;

                case 12:
                    running = false;
                    System.out.println(" Thank you for using the bookstore system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
                scanner.close();
          
        }
       
}
}          
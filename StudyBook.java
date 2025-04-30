
package phasetwo;

public class StudyBook extends Book{
    private String subject;
    private String gradeLevel;

    public StudyBook(String title, String author, boolean isBorrowed, String subject, String gradeLevel) {
        super(title, author, isBorrowed);
        this.subject = subject;
        this.gradeLevel = gradeLevel;
    }

    
    public void printType() {
        System.out.println("This is a Study Book.");
    }

    
    public String display() {
       return ("Study Book - Title: " + title + ", Author: " + author +
                ", Subject: " + subject + ", Grade Level: " + gradeLevel +
                ", Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    

}

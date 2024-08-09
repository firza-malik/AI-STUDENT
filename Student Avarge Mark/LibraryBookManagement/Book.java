package LibraryBookManagement;


/*Create a Book class with attributes like title, author, ISBN, and availability status.
Create a Library class that manages a collection of books.
Implement methods to add books, search for books, and check out/return books.
Maintain a simple lending history for each book (e.g., who borrowed it, when it was returned). */


import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private boolean availability;
    private List<String> lendingHistory;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = true;
        this.lendingHistory = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }
    public String getAuthor(){
        return author; 
    }

    public boolean getAvailability() {
        return availability;
    }

    public void checkOut(String borrower) {
        if (availability) {
            availability = false;
            lendingHistory.add("Checked out by: " + borrower);
            System.out.println(title + " has been checked out by " + borrower);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnBook() {
        if (!availability) {
            availability = true;
            lendingHistory.add("Returned");
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }

    public void printLendingHistory() {
        System.out.println("Lending history for " + title + ":");
        for (String record : lendingHistory) {
            System.out.println(record);
        }
    }

   
}

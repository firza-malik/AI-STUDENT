package LibraryBookManagement;

import java.util.ArrayList;

public class Library {

    ArrayList<Book>books;
    Library(){
        books=new ArrayList<>();

    }
    //add
    public void Addbook(Book Books){
                books.add(Books);
                System.out.println(Books.getTitle()+"books add successfully");

            
        
       
    }
    //search for books
    public Book SearchBook(int ISBN){
        for(Book book: books){
            if (book.getISBN()==ISBN) {
                return book;
                
            }
        }
        return null;


    }
    public void checkOutBook(int ISBN, String borrower) {
        Book book = SearchBook(ISBN);
        if (book != null && book.getAvailability()) {
            book.checkOut(borrower);
        } else if (book != null) {
            System.out.println("Book is not available for checkout.");
        }
    }

    // Return a book by ISBN
    public void returnBook(int ISBN) {
        Book book = SearchBook(ISBN);
        if (book != null && !book.getAvailability()) {
            book.returnBook();
        } else if (book != null) {
            System.out.println("Book was not checked out.");
        }
    }

    public void printLendingHistory(int ISBN) {
        Book book = SearchBook(ISBN);
        if (book != null) {
            book.printLendingHistory();
        }
    }
}
    


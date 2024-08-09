package LibraryBookManagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("jannat ke pattay", "nimar Ahmed", 123456);
        Book book2 = new Book("peer_e_ kamil", "umera Ahmed", 789101);

        library.Addbook(book1);
        library.Addbook(book2);

        library.SearchBook(789101);

        library.checkOutBook(123456,"jannat ke pattay");

        library.returnBook(123456);
        
        library.printLendingHistory(789101);

    }

}

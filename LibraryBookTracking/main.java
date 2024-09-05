package LibraryBookTracking;
import java.time.LocalDate;


public class main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("*****Library Book Tracking*****");
        System.out.println("---------------------------------------------------");
        EBook ebook=new EBook("peer_e_kamel", "Umera Ahmad.",LocalDate.of(2024, 07, 12), 12,"Pdf","134MB",525);
        
        PrintedBooks printedBooks=new PrintedBooks("jannat ke patty", "Nimra Ahmed", LocalDate.of(2015,06,23), 10);

        ebook.display();
        System.out.println();
        printedBooks.display();
        
    }
    
}

package LibraryBookTracking;

import java.time.LocalDate;

public class PrintedBooks extends Book{
    PrintedBooks(String title,String author,LocalDate publicationDate,int ID){
        super(title, author, publicationDate, ID);
        
    }
    public void display(){
        System.out.println("****Printed Book****");
        super.display();
    }
    
}

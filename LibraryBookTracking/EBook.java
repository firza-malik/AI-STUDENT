package LibraryBookTracking;

import java.time.LocalDate;

public class EBook extends Book {
    public String format,filesize;
    public int pagesno;
    EBook(String title,String author,LocalDate publicationDate,int ID,String format,String filesize,int pagesno){
        super(title, author, publicationDate, ID);
        this.format=format;
        this.filesize=filesize;
        this.pagesno=pagesno;

    }
    public void display(){
        System.out.println("****EBook****");
        super.display();
        System.out.println("Format: "+format);
        System.out.println("File siza: "+ filesize);
        System.out.println("pages number :"+ pagesno+" pages");
        
    }

    
    
    
}

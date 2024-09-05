package LibraryBookTracking;
/*Scenario: Design a system to keep track of books in a library. Each book has a title, author, publication date, and an ID. There are different types of books: eBooks and Printed Books.
Concepts: Classes, Inheritance, Date
Task: Create a Book class with relevant attributes and methods. Then, create EBook and PrintedBook classes that extend Book. Implement methods to display book details. */

import java.time.LocalDate;

public class Book {
   public String title,author;
    public LocalDate publicationDate;
    public int ID;
    Book(String title,String author,LocalDate publicationDate,int ID){
        this.title=title;
        this.author=author;
        this.publicationDate=publicationDate;
        this.ID=ID;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication date: "+publicationDate);
        System.out.println("ID: "+ID);
    }
    
}

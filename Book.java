public class Book {
    String author, title, genre;

    public void displayname() {
        System.out.println("author: " + author);
        System.out.println("genre: " + genre);
        System.out.println("title: " + title);
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.author = "nimra Ahmed";
        myBook.title = "jannat ke patty";
        myBook.genre = "novel";
        myBook.displayname();
    }
}


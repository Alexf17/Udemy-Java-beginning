package udemy.LibraryApp.src.main.java.libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for book with isbn: %s \n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("Book found: \n \tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        } else {
            System.out.println("0 books found");
        }
        System.out.print("\n");
    }

    public void SearchByTitle(String title) {
        System.out.printf("Searching for books with '%s' in title...\n", title);
        ArrayList<Book> books = bookRepo.findByTitle(title);
        for (Book book : books) {
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());

        }

        System.out.println((books.size()==0) ? "No books :( " : "");
    }
    public void  checkOut(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            if(book.checkOut()){
                System.out.println("Checkout successful");
            } else { System.out.println("Checkout failed");
                System.out.printf("Book with ISBN '%s' is ended.\n", isbn);}
        } else {
            System.out.println("Checkout failed");
            System.out.printf("There was no book with ISBN '%s'\n", isbn);
        }
    }
    public void  checkIn(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            if(book.checkIn()){
                System.out.println("Check-in successful");
            } else {
                System.out.println("Check in failed");
                System.out.printf("There was no book with ISBN '%s'\n", isbn);
            }

        } else {
            System.out.println("Check in failed");
            System.out.printf("There was no book with ISBN '%s'\n", isbn);
        }
    }
}

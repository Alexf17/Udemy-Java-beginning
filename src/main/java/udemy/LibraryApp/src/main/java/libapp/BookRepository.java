package udemy.LibraryApp.src.main.java.libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository(){
        Book book1 = new Book("21321","The new day", "Horror",null, "j.S.",2,1);
        books.add(book1);
        books.add(new Book("233532","Old day", "Tiller",null, "O.R.",3,0));
        books.add(new Book("43234","New old ", "Comedy",null, "P.E.",5,0));
    }
    public Book findByIsbn(String isbn){
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String title){
        ArrayList<Book> foundedBooks = new ArrayList<Book>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                foundedBooks.add(book);

            }
        }
        return foundedBooks;
    }
}

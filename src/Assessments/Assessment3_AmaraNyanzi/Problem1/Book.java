package Assessments.Assessment3_AmaraNyanzi.Problem1;

import java.util.ArrayList;

public class Book extends LibraryItem{
    String isbn;
    String genre;

    Book(String itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    void checkout(LibraryItem book) {
        book.setAvailable(false);
        System.out.println("Book"+ book.getTitle() + "has been checked out");
    }

    @Override
    void returnItem(LibraryItem book) {
        book.setAvailable(true);
        System.out.println("Book"+ book.getTitle() + "has been returned");

    }

    @Override
    void displayDetails() {
        System.out.println("Book: [item id: " + itemId
                + ", title: " + title + ", author: " + author
                + ", isbn: " + isbn + ", genre: " + genre + "]");
    }
}

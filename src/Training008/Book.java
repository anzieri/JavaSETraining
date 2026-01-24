package Training008;

import java.util.Date;

/*
    Practice Exercise 3: Library Book System
    Create an encapsulated
    Private Fields:
    Book class for a library system:
    isbn (String, immutable)
    title (String)
    author (String)
    isAvailable (boolean)
    dueDate (LocalDate - optional)

    Requirements:
    isbn should be final and validated (13 digits)
    title and author cannot be empty
    isAvailable should have no setter, only getter
    Methods: borrowBook(), returnBook(), isOverdue()
    Constructor with validation
    Follow encapsulation principles
 */
public class Book {

    private String title;
    private String author;
    private final String isbn;
    private boolean available;
    private Date dueDate;

    //TODO: Get This Done
    public static void borrowBook(Book book) {}

    public static void returnBook(Book book) {}

    public static void isOverdue(){}

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn, boolean available, Date dueDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}


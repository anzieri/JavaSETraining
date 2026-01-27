package Training012;

import java.util.ArrayList;

/*
    Practice Exercise 3: Library Management System
    Create a Library class with nested classes:
    Outer Class: Library
    name, location
    Static Nested Class: Book
    isbn, title, author, isAvailable
    Inner Class: LibraryMember
    memberId, name, borrowedBooks
    Methods to add books, register members, and borrow/return books
 */
public class Library {

    private static ArrayList<Book> library = new ArrayList<Book>();
    private static ArrayList<LibraryMember> members = new ArrayList<LibraryMember>();

    public static class Book{
        public double isbn;
        public String title;
        public String author;
        public boolean isAvailable;

        public Book(double isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public void setisAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setIsbn(double isbn) {
            this.isbn = isbn;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public double getIsbn() {
            return isbn;
        }

        public String getAuthor() {
            return author;
        }
    }

    public static class LibraryMember{
        public double memberId;
        public String name;
        public String borrowedBooks;

        public LibraryMember(String name) {
            this.name = name;
        }

        public LibraryMember(double memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }

        public LibraryMember(double memberId, String name, String borrowedBooks) {
            this.memberId = memberId;
            this.name = name;
            this.borrowedBooks = borrowedBooks;
        }

        public void setBorrowedBooks(String borrowedBooks) {
            this.borrowedBooks = borrowedBooks;
        }

        public void setMemberId(Double memberId) {
            this.memberId = memberId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMemberId() {
            return memberId;
        }

        public String getBorrowedBooks() {
            return borrowedBooks;
        }

        public String getName() {
            return name;
        }
    }

    public static void addBooks(double isbn, String title, String author ){
        Book book = new Book(isbn, title, author);
        library.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public static void registerMembers(double ID, String name){

        LibraryMember libraryMember = new LibraryMember(ID, name);
        for (LibraryMember m : members) {
            if(ID == m.getMemberId()){
                libraryMember.setMemberId(null);
                libraryMember.setName(null);

                throw new DuplicateIDException("Member ID already exist. Try Again!");
            }
        }
        members.add(libraryMember);
        System.out.println("Member Creation Sucessful: " + libraryMember.getName());
    }

    static void main(String[] args) {
        addBooks(92873927, "Diverse Socrates", "Micheal Bert");

        addBooks(10727927, "Traitor", "Jackson Chi");

        registerMembers(734,"William Bosco");

        registerMembers(718,"John Bosco");

        borrowBook("Traitor");

        Book book = library.get(1);
        if (book.isAvailable) {
            System.out.println("Book Available: " + book.getTitle());
        } else {
            System.out.println("Book Unavailabe: " + book.getTitle());
        }
    }

    public static void borrowBook(String title){

        for(Book book : library){
            if(book.getTitle().equals(title) && book.isAvailable()){
                book.isAvailable = false;
                System.out.println("Book Borrowed: " + book.getTitle());
            }
        }
        System.out.println("Operation complete");
    }

    public static void returnBook(String title){

        for(Book book : library){
            if(book.getTitle().equals(title) && !book.isAvailable()){
                book.isAvailable = true;
                System.out.println("Book Returned: " + book.getTitle());
            }
        }
        System.out.println("Operation complete");
    }
}

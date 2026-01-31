package Assessments.Assessment3_AmaraNyanzi.Problem1;

public abstract class LibraryItem {
    String itemId;
    String title;
    String author;
    boolean isAvailable;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
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
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    abstract void checkout(LibraryItem item);

    abstract void returnItem(LibraryItem item);

     void displayDetails(){
        System.out.println("Library Item: { itemId: " + itemId + ", title: " + title + ", author: " + author  );
    }
}

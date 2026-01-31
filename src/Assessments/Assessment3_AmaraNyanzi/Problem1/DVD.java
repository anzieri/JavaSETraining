package Assessments.Assessment3_AmaraNyanzi.Problem1;

public class DVD extends LibraryItem{
    int duration;
    String rating;

    DVD(String itemId, String title, String author, int duration, String rating) {
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    void checkout(LibraryItem DVD) {
        DVD.setAvailable(false);
        System.out.println("DVD"+ DVD.getTitle() + "has been checked out");
    }

    @Override
    void returnItem(LibraryItem DVD) {
        DVD.setAvailable(true);
        System.out.println("DVD"+ DVD.getTitle() + "has been returned");
    }

    @Override
    void displayDetails() {
        System.out.println("DVD: [itemId: " + itemId + ", title: " + title
                + ", author: " + author + ", duration: "
                + duration + ", rating: " + rating);
    }
}

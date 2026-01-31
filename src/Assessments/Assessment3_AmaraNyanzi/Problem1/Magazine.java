package Assessments.Assessment3_AmaraNyanzi.Problem1;

import java.util.Date;

public class Magazine extends LibraryItem{
    int issueNumber;
    String publicationDate;

    Magazine(String itemId, String title, String author, int issueNumber, String publicationDate) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    void checkout(LibraryItem magazine) {
        magazine.setAvailable(false);
        System.out.println("Magazine " + magazine.getTitle()+ " has been checked out.");
    }

    @Override
    void returnItem(LibraryItem magazine) {
        magazine.setAvailable(true);
        System.out.println("Magazine " + magazine.getTitle()+ " has been returned.");
    }

    @Override
    void displayDetails() {
        System.out.println("DVD: [itemId: " + itemId + ", title: " + title
                + " issueNumber: " + issueNumber
                + ", publicationDate: " + publicationDate.toString() + "]");
    }
}

package Assessments.Assessment3_AmaraNyanzi.Problem1;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Amara Nyanzi
 * Date: 31/01/2026
 * Problem:  OOP Design & Implementation
 *
 * Key Features:
 * - Encapsulation, Polymorphism, Abstraction, Inheritance
 * - [List exception handling techniques used]
 * - [Any additional notable implementations]
 */
public class LibraryTest {
    static void main(String[] args) {
        // Your solution should demonstrate:
        LibraryItem[] items = {
                new Book("B001", "Java Programming", "John Doe", "123-4567890123", "Education"),
                new DVD("D001", "Java Tutorial", "Jane Smith", 120, "PG"),
                new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-03-01")
        };
        // Polymorphic behavior
        for (LibraryItem item : items) {
            item.displayDetails(); // Each should show different information
            item.checkout(item); // Each might have different checkout logic
        }
    }
}

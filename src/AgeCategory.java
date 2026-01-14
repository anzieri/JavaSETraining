import java.util.Scanner;

/* Training III

    Practice Exercise 1: Age Category
    Create a program that categorizes a person's age:
    0-2: Infant
    3-12: Child
    13-19: Teenager
    20-64: Adult
    65+: Senior
    Example:
    Enter age: 25
    Category: Adult

 */



public class AgeCategory {
    static void main(String[] args) {

        System.out.print("Enter Age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age >= 0 && age <= 2) {
            System.out.println("Category: Infant");
        } else if (age >=3 && age <=12) {
            System.out.println("Category: Child");
        }else if (age >=13 && age <=19) {
            System.out.println("Category: Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Category: Adult");
        } else if (age > 65) {
            System.out.println("Category: Senior");
        }else  {
            System.out.println("Invalid");
        }
    }
}

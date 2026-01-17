package Training002;

import java.util.Scanner;

/* Training II

    Practice Exercise 2: Student Information
    Create a program that:
    1. Takes student information (name, age, grade, GPA)
    2. Stores them in appropriate variables
    3. Displays a formatted summary
    Example Output:
            === Student Information ===
    Name: Alice Johnson
    Age: 20 years
    Grade: B
    GPA: 3.4
    Is Graduating: false
*/
public class StudentInformation {
    static void main() {
        System.out.print("=== Student Information ===\nKindly input the following:\nName: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Grade: ");
        String grade = input.nextLine();

        System.out.print("GPA: ");
        double gpa = input.nextDouble();
        boolean isGraduating = false;

        if(gpa >= 2.5) isGraduating = true;

        System.out.println("Is Garduating: " + isGraduating);

    }
}

package Training004;

/*  Training IV

    Practice Exercise 1: Training004.Multiplication Table
    Create a program that generates a multiplication table for a given number.
    Example:
    Enter a number: 7
    7 x 1 = 7
    7 x 2 = 14
    7 x 3 = 21
    ...
    7 x 10 = 70
 */

import java.util.Scanner;

public class Multiplication {
    static void main(String[] args) {
        System.out.println("Enter the number of multiplications you want to multiply: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

package Training004;

import java.util.Scanner;

/*  Trianing IV

    Practice Exercise 2: Number Statistics
    Create a program that:
    Takes numbers from user until they enter 0
    Calculates sum, count, and average
    Ignores negative numbers using continue
    Example:
    Enter number (0 to stop): 5
    Enter number (0 to stop): -3 (ignored)
    Enter number (0 to stop): 10
    Enter number (0 to stop): 0
    Sum: 15, Count: 2, Average: 7.5
 */
public class NumberStatistics {
    static void main(String[] args) {

        int sum = 0;
        int count = 0;
        double average = 0;
        int number = 1;

        do {
            System.out.print("Enter number (0 to stop): ");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            if (number < 0 || number == 0) {
                continue;
            }
            sum = sum + number;
            count++;
            average = calculateAverage(sum, count);
        } while(number != 0);

        System.out.println("Sum: " + sum + ", Count: " + count + ", Average:" + average);
    }

    static double calculateAverage(int total, int count){
        return (double) total / count;
    }
}

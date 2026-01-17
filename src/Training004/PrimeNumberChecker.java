package Training004;

import java.util.Scanner;

/*  Training IV

    Practice Exercise 3: Prime Number Checker
    Create a program that checks if a number is prime using loops.
    Prime number: Only divisible by 1 and itself.
    Example:
    Enter a number: 17
    17 is a prime number
    Enter a number: 15
    15 is not a prime number
 */
public class PrimeNumberChecker {
    static void main(String[] args) {
        // Modulus in overdrive.
        System.out.println(" === Prime Number Checker ===\n\nThis program only caters for first few hundred primes");
        Scanner scanner = new Scanner(System.in);

        //TO BE OPTIMISED, im tired
        for(int i = 0; i <=10; i++){
            System.out.println("Enter a number between 1 and 100");
            int num = scanner.nextInt();
            if(num>2 && num % 2 != 0){ //Eliminate evens
                System.out.println(num + " is not a prime number");
            } else if (num>3 && num % 3 != 0) {
                System.out.println(num + " is not a prime number");
            }  else if (num>5 && num % 5 != 0) {
                System.out.println(num + " is not a prime number");
            } else if (num>7 && num % 7 != 0) {
                System.out.println(num + " is not a prime number");
            } else {
                System.out.println(num + " is a prime number");
            }
        }
    }
}

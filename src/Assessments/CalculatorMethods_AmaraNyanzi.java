package Assessments;

/*  Training VI

    Practice Exercise 1: Basic Calculator Methods
    Create methods for basic arithmetic operations:
    Requirements:
    add(a, b) - returns sum of two numbers
    subtract(a, b) - returns difference
    multiply(a, b) - returns product
    divide(a, b) - returns quotient, handles division by zero
    main method to test all operations
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMethods_AmaraNyanzi {
    static ArrayList<String> messages = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int firstNumber, secondNumber;
    static void main() {
        operation();
        scanner.close();
    }

    public static void operation(){
        int choice;
        int repeat = 0;

        while(repeat==0){
            System.out.println("=== Calculator Assesment ===" +
                    "\nPlease select appropriate operation you wish to carry out" +
                    "\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n6. Square Root \n7. Power\n8. Calculator History" +
                    "\nEnter your choice (1-8): ");

            choice = scanner.nextInt();

            if(choice<1 || choice>8){
                System.out.println("Invalid choice");
                continue;
            }

            if (choice <=7) {
                System.out.println("Input first number: ");
                firstNumber = scanner.nextInt();

                System.out.println("Input last number: ");
                secondNumber = scanner.nextInt();
            }

            if(choice == 4 && secondNumber==0){
                System.out.println("Invalid division, can't divide by zero");
                continue;
            }

            switch (choice){
                case 1: addition(firstNumber,secondNumber);
                        break;
                case 2: subtraction(firstNumber,secondNumber);
                        break;
                case 3: multiplication(firstNumber,secondNumber);
                        break;
                case 4: division(firstNumber,secondNumber);
                        break;
                case 5: modulo(firstNumber,secondNumber);
                        break;
                case 6: squareRoot(firstNumber,secondNumber);
                        break;
                case 7: power(firstNumber,secondNumber);
                        break;
                case 8: System.out.println("Calculator History:\n");

                    for (String outputMessage : calculatorHistory("END")) {
                        System.out.println(outputMessage);
                    }
                    break;
                default:
                    System.out.println("Invalid choice/operation");
            }

            System.out.println("To Continue, Type 0\nTo Exit, Type 1");
            repeat = scanner.nextInt();
        }

    }

    public static int addition(int a, int b) {
        int sum = a + b;
        String message = String.format("Result: %d + %d = %d",a,b,sum);
        System.out.println(message);
        calculatorHistory(message);
        return sum;
    }

    public static int subtraction(int a, int b) {
        int subtract = a - b;
        String message = String.format("Result: %d - %d = %d",a,b,subtract);
        System.out.println(message);
        calculatorHistory(message);
        return subtract;
    }

    public static int multiplication(int a, int b) {
        int multiply = a * b;
        String message = String.format("Result: %d * %d = %d",a,b,multiply);
        System.out.println(message);
        calculatorHistory(message);
        return multiply;
    }

    public static double division(int a, int b) {

        double divide = (double) a / b;
        String message = String.format("Result: %d / %d = %.2f",a,b,divide);
        System.out.println(message);
        calculatorHistory(message);
        return divide;
    }

    public static int modulo(int a, int b) {
        int modul = a % b;
        String message = String.format("Result: %d mod %d = %d",a,b,modul);
        System.out.println(message);
        calculatorHistory(message);
        return modul;
    }

    public static double power(int a, int b){
        double power = Math.pow( a, b);
        String message = String.format("Result: %d power of %d = %.5f",a,b,power);
        System.out.println(message);
        calculatorHistory(message);
        return power;
    }

    public static double squareRoot(int a, int b){
        int makeItBigger = a*a + b*b;
        double root = Math.sqrt(makeItBigger);
        String message = String.format("Result: squareRoot of %d = %.4f",makeItBigger,root);
        System.out.println(message);
        calculatorHistory(message);
        return root;
    }

    public static ArrayList<String> calculatorHistory(String message){
        messages.add(message);
        return messages;
    }

}

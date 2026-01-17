package Training002;

import java.util.Scanner;

/* Training II

    Practice Exercise 1: Training002.Calculator
    Create a simple calculator that:
    1. Takes two numbers as input
    2. Performs all arithmetic operations
    3. Displays the results
    Example Output:
    Enter first number: 10
    Enter second number: 3
    Results:
            10 + 3 = 13
            10 - 3 = 7
            10 * 3 = 30
            10 / 3 = 3.333...
            10 % 3 = 1 36
*/
public class Calculator {

    public static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = input.nextInt();
        System.out.println("Enter second number:");
        int secondNum = input.nextInt();

        Calculator.arithmetic(firstNum, secondNum);
        input.close();

    }

    public static void arithmetic(int firstNum, int secondNum){
        int result;
        double divResult;
        result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + result);
        result = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + result);
        result = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + result);
        divResult = (double) firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + divResult);
        result = firstNum % secondNum;
        System.out.println(firstNum + " % " + secondNum + " = " + result);
    }
}

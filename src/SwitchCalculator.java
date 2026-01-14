import java.util.Scanner;

/* Training III

    Practice Exercise 2: Calculator
    Create a calculator using switch that:
    Takes two numbers and an operator (+, -, *, /, %)
    Performs the operation
    Handles division by zero
    Example:
    Enter first number: 10
    Enter operator (+, -, *, /, %): *
    Enter second number: 5
    Result: 50
*/
public class SwitchCalculator {

    static void main(String[] args) {
        System.out.print("Enter first Number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.print("Enter Operator (+,-,*,/,%): ");
        Character operator = scanner.next().charAt(0);
        System.out.print("Enter second Number: ");
        int secondNum = scanner.nextInt();

        int result = 0;
        double divResult = 0.0;

        switch (operator) {
            case '+': result = firstNum + secondNum;
                System.out.println("Result" + " = " + result);
                break;
            case '-': result = firstNum - secondNum;
                System.out.println("Result" + " = " + result);
                break;
            case '*': result = firstNum * secondNum;
                System.out.println("Result" + " = " + result);
                break;
            case '/': divResult = (double) firstNum / secondNum;
                System.out.println("Result" + " = " + divResult);
                break;
            case '%': result = firstNum % secondNum;
                System.out.println("Result" + " = " + result);
                break;
            default:
                System.out.println("Not an Operator");
        }
    }
}

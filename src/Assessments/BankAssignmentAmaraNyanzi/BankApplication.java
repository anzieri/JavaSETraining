package Assessments.BankAssignmentAmaraNyanzi;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bank Account System ===\n" +
                "1. Create Savings Account\n" +
                "2. Create Checking Account\n" +
                "3. Deposit\n" +
                "4. Withdraw\n" +
                "5. Check Balance\n" +
                "6. Apply Interest (Savings)\n" +
                "7. Display All Accounts\n" +
                "8. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Account Number: ");
                String accountNumber = scanner.nextLine();
                System.out.println("Enter Holder: ");
                String accountHolder = scanner.nextLine();
                System.out.println("Enter Account Balance: ");
                double balance = scanner.nextDouble();
                System.out.println("Enter Interest Rate: ");
                double interestRate = scanner.nextDouble();
                SavingsAccount any = new SavingsAccount(accountNumber,accountHolder, balance, interestRate);
        }
        //TO BE CONTINUED!
    }
}

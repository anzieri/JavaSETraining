package Assessments.BankAssignmentAmaraNyanzi;

import java.util.Scanner;

import static Assessments.BankAssignmentAmaraNyanzi.BankAccount.deposit;

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

        int choice = 0;
        while (choice != 8) {
            System.out.println("Enter choice(1-8):");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Account Number: ");
                    String accountNumber = scanner.next();
                    System.out.println("Enter Holder: ");
                    String accountHolder = scanner.next();
                    System.out.println("Enter Account Balance: ");
                    double balance = scanner.nextDouble();
                    System.out.println("Enter Interest Rate: ");
                    double interestRate = scanner.nextDouble();
                    BankAccount account = new SavingsAccount(accountNumber, accountHolder, balance, interestRate);
                    bank.addAccount(account);

                    System.out.println("Created Successfully: " + account.toString());
                    break;
                }

                case 2: {
                    System.out.println("Enter Account Number: ");
                    String accountNumber = scanner.next();
                    System.out.println("Enter Holder: ");
                    String accountHolder = scanner.next();
                    System.out.println("Enter Account Balance: ");
                    double balance = scanner.nextDouble();
                    System.out.println("Enter Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    BankAccount account = new CheckingAccount(accountNumber, accountHolder, balance, overdraftLimit);
                    bank.addAccount(account);

                    System.out.println("Created Successfully: " + account.toString());
                    break;
                }
                case 3: {
                    System.out.println("Enter Account Number to Deposit into: ");
                    String accountNumber = scanner.next();
                    System.out.println("Enter Amount to Deposit: ");
                    double toDeposit = scanner.nextDouble();
                    deposit(bank.findAccount(accountNumber), toDeposit);
                    System.out.println("Successfully Deposited: " + toDeposit);
                    break;
                }
                case 4: {
                    System.out.println("Enter Account Number to Withdraw from: ");
                    String accountNumber = scanner.next();
                    System.out.println("Enter Amount to Withdraw: ");
                    double toWithdraw = scanner.nextDouble();

                    BankAccount account = bank.findAccount(accountNumber);
                    if (account != null) {
                        account.withdraw(account, toWithdraw);
                        System.out.println(toWithdraw + " withdrawn successfully.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Enter Account Number to Check Balance: ");
                    String accountNumber = scanner.next();

                    BankAccount account = bank.findAccount(accountNumber);
                    if (account != null) {
                        double balance = account.getBalance();
                        System.out.println("Account Balance: " + balance);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Enter Account Number to Apply Interest: ");
                    String accountNumber = scanner.next();
                    SavingsAccount account = (SavingsAccount) bank.findAccount(accountNumber);
                    account.applyInterest();
                    break;
                }
                case 7: {
                    bank.displayAllAccounts();
                    break;
                }
                case 8: {
                    System.out.println("Thank you for using my Bank Application");
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
        }
        }
    }
}

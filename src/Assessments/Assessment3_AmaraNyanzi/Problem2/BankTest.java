package Assessments.Assessment3_AmaraNyanzi.Problem2;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Amara Nyanzi
 * Date: 31/01/2026
 * Problem: Exception Handling
 *
 * Key Features:
 * - [List key OOP concepts demonstrated]
 * - Both Checked and Unchecked Exceptions implemented
 * -
 */
public class BankTest {
    static void main(String[] args) {
        // Demonstrate comprehensive exception handling
        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);
            account1.deposit(-100); // Should throw InvalidTransactionException
            account1.withdraw(2000); // Should throw InsufficientFundsException
            account1.transfer("INVALID", 100); // Should throw AccountNotFoundException

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}

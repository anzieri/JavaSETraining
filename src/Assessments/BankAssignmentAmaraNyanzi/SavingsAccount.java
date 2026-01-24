package Assessments.BankAssignmentAmaraNyanzi;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException(
                    "Cannot withdraw: Minimum balance of $" + MIN_BALANCE + " required");
        }
        balance = balance - amount;
    }

    public void applyInterest() {
        balance = balance + (balance * interestRate);
    }

    @Override
    public String toString() {
        return String.format("Savings Account - Number: %s, Holder: %s, Balance: $%.2f, Interest Rate: %.2f%%",
                getAccountNumber(), getAccountHolder(), getBalance(), interestRate * 100);
    }

}

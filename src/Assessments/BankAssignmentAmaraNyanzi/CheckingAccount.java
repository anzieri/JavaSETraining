package Assessments.BankAssignmentAmaraNyanzi;

public class CheckingAccount extends  BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws  InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }

        double currentBalance = getBalance();
        double available = currentBalance + overdraftLimit;

        if (amount > available) {
            throw new InvalidAmountException(String.format(
                    "Insufficient funds: attempted %.2f, available %.2f (including overdraft)",
                    amount, available));
        }
    }

    @Override
    public String toString() {
        return String.format("Checking Account - Number: %s, Holder: %s, Balance: $%.2f, Overdraft Limit: $%.2f",
                getAccountNumber(), getAccountHolder(), getBalance(), overdraftLimit);
    }

}

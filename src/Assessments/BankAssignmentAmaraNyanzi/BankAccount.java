package Assessments.BankAssignmentAmaraNyanzi;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount() {}

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) throws InvalidAmountException {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        if (balance <= 0) {
            throw new InvalidAmountException("Transaction Failed, Amount to deposit has to be greater than 0.");
        }
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void deposit(BankAccount bankAccount, double amount) throws InvalidAmountException {
        double oldBalance = bankAccount.getBalance();

        if (amount <= 0) {
            throw new InvalidAmountException("Transaction Failed, Amount to deposit has to be greater than 0.");
        }
        double newBalance = oldBalance + amount;
        bankAccount.setBalance(newBalance);
    }

    public void withdraw(BankAccount bankAccount,double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount cannot be less than 0.");
        }
        if (amount > bankAccount.getBalance()) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        bankAccount.setBalance(bankAccount.getBalance()- amount);
    }


    public static void displayOptions(){}

    @Override
    public String toString() {
        return String.format("Account Number: %s, Holder: %s, Balance: $%.2f",
                accountNumber, accountHolder, balance);
    }

}

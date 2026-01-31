package Assessments.Assessment3_AmaraNyanzi.Problem2;

import java.util.ArrayList;

public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    void deposit(double amount) {
        if(amount < 0) {
            throw new InvalidTransactionException("Amount cannot be zero or negative");
        }

        this.balance += amount;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds.");
        }
        this.balance -= amount;
    }

    void transfer(String toAccount, double amount) throws AccountNotFoundException{

        if(!toAccount.startsWith("ACC0")){
            throw new AccountNotFoundException("Account does not exist. Invalid account number");
        }
        System.out.println("Transferring " + amount + " to account" + toAccount);
    }


}

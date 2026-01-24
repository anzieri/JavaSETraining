package Assessments.BankAssignmentAmaraNyanzi;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) throws ExistingAccountException {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == account.getAccountNumber()) {
                throw new ExistingAccountException("Account already exists");
            }
        }
        accounts.add(account);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        System.out.println("Account not found");
        return null;
    }

    public void displayAllAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account.toString());
        }
    }
}

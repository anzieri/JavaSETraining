package Assessments.BankAssignmentAmaraNyanzi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
            if (Objects.equals(acc.getAccountNumber(), accountNumber)) {
                System.out.println("Found account: " + acc.getAccountNumber());
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

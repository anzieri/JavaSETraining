package Training011;

import java.util.Date;

public class BankTransferPayment extends Payment{
    public double accountNumber;
    public String bankName;


    public BankTransferPayment(double accountNumber, String bankName, Date paymentDate, double amount) {
        super(amount, paymentDate);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }



    @Override
    public void processPayment() {
        validateAmount(amount);
        System.out.println("Bank Transfer Successful");
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Payment Details:" +
                "\nAccountNumber: " + accountNumber +
                "\nBank Name: "+ bankName +
                "\nPayment Amount: " + amount +
                "\nPayment Date: "+ paymentDate);
    }
}

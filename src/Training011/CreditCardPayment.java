package Training011;

import java.util.Date;

public class CreditCardPayment extends Payment {
    public double cardNumber;
    public Date expiryDate;

    public CreditCardPayment(double amount, Date paymentDate) {
        super(amount, paymentDate);
    }

    @Override
    public void processPayment() {
        validateAmount(amount);
        System.out.println("Credit Card Transaction Successful");
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Payment Details:" +
                "\nCredit Card Number: " + cardNumber +
                "\nExpiry Date: "+ expiryDate +
                "\nPayment Amount: " + amount +
                "\nPayment Date: "+ paymentDate);
    }
}

package Training011;

import java.util.Date;

/*
    Practice Exercise 3: Payment System
    Create a payment processing system:
    Abstract Class: Payment
    amount, paymentDate fields
    Abstract processPayment() method
    Abstract getPaymentDetails() method
    Concrete validateAmount() method

    Concrete Classes:
    CreditCardPayment with cardNumber, expiryDate
    PayPalPayment with email
    BankTransferPayment with accountNumber, bankName
    Test with polymorphic payment processing.
 */
public abstract class Payment {
    public double amount;
    public Date paymentDate;

    public Payment(double amount, Date paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
    public abstract void processPayment();
    public abstract void getPaymentDetails();

    public static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new InvalidAmount("Amount cannot be negative or zero");
        }
    };
}

package Training011;

import java.util.Date;

public class PayPalPayment extends Payment{
    public String email;

    public PayPalPayment(String email, double amount, Date paymentDate) {
        super(amount, paymentDate);
        this.email = email;
    }

    @Override
    public void processPayment() {
        validateAmount(amount);
        System.out.println("PayPal Transaction Successful");
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Payment Details:" +
                "\nEmail: " + email +
                "\nPayment Amount: " + amount +
                "\nPayment Date: "+ paymentDate);
    }
}

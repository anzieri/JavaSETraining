package Training011;

import java.text.DateFormat;
import java.util.Date;

public class PaymentSystem {
    static void main(String[] args) {
        Payment something = new BankTransferPayment(
                987654321,
                "Standard Chartered",
                new Date("05/02/2026"),
                56_000
        );
        something.processPayment();
        something.getPaymentDetails();
    }
}

package Training011;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PaymentSystem {
    static void main(String[] args) throws ParseException {

        System.out.println(" ===Payment System ==="+
                "\n1. Bank Payment" +
                "\n2. Paypal Payment" +
                "\n3. Credit Card payment" +
                "\n4. Exit");

        Scanner input = new Scanner(System.in);
        int choice=0;
        while(choice!=4){
            choice = input.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("Enter Account Number: ");
                    double accoutNumber = input.nextDouble();
                    System.out.println("Enter Bank Name: ");
                    String bankName = input.next();
                    System.out.println("Enter Payment Amount: ");
                    double payment = input.nextDouble();


                    Payment something = new BankTransferPayment(
                            accoutNumber,
                            bankName,
                            new Date(),
                            payment
                    );
                    something.processPayment();
                    something.getPaymentDetails();
                    break;

                }
                case 2: {
                    System.out.println("Enter Email: ");
                    String email = input.next();
                    System.out.println("Enter Payment Amount: ");
                    double payment = input.nextDouble();

                    Payment something = new PayPalPayment(
                            email,
                            payment,
                            new Date()
                    );
                    something.processPayment();
                    something.getPaymentDetails();
                    break;

                }
                case 3: {
                    System.out.println("Enter Credit Card Number: ");
                    double cardNumber = input.nextDouble();
                    System.out.println("Enter Payment Amount: ");
                    double payment = input.nextDouble();
//                    System.out.println("Enter Credit Card Expiry Date: (MM/DD/YYYY): ");
//                    String cardExpiryDate = input.next();
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    Date expiry =  new Date("02/02/2024");
                    Payment something = new CreditCardPayment(
                            cardNumber,
                            expiry,
                            payment,
                            new Date()
                    );
                    something.processPayment();
                    something.getPaymentDetails();
                    break;

                }
                case 4:
                    System.out.println("Exited");

            }
        }

    }
}

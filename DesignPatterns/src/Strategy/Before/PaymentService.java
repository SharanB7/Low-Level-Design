package Strategy.Before;

public class PaymentService {

    public void processPayment(String paymentMethod) {
        switch (paymentMethod) {
            case "CREDIT_CARD" -> System.out.println("Processing payment using Credit Card...");
            case "APPLE_PAY" -> System.out.println("Processing payment using Apple Pay...");
            case "ZELLE" -> System.out.println("Processing payment using Zelle...");
            case "GOOGLE_PAY" -> System.out.println("Processing payment using Google Pay...");
            default -> System.out.println("Invalid payment method");
        }
    }

}

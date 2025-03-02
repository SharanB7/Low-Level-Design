package Strategy;

import Strategy.After.PaymentService;
import Strategy.After.Strategies.CreditCardStrategy;
import Strategy.After.Strategies.ZelleStrategy;

public class StrategyMain {

    public static void invoke() {

        // Naive Approach
        Strategy.Before.PaymentService paymentService1 = new Strategy.Before.PaymentService();
        paymentService1.processPayment("GOOGLE_PAY");

        Strategy.Before.PaymentService paymentService2 = new Strategy.Before.PaymentService();
        paymentService2.processPayment("APPLE_PAY");

        // Using Strategy pattern
        PaymentService paymentService3 = new PaymentService(new CreditCardStrategy());
        paymentService3.processPayment();

        paymentService3.setPaymentStrategy(new ZelleStrategy());
        paymentService3.processPayment();

    }

}

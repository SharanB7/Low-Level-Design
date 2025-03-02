package Strategy.After.Strategies;

import Strategy.After.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Processing payment using credit card...");
    }

}

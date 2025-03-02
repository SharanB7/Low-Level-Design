package Strategy.After.Strategies;

import Strategy.After.PaymentStrategy;

public class ApplePayStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Processing payment using Apple Pay...");
    }

}

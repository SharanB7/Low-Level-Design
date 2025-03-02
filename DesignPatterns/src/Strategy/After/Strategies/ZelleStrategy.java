package Strategy.After.Strategies;

import Strategy.After.PaymentStrategy;

public class ZelleStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Processing payment using Zelle...");
    }

}

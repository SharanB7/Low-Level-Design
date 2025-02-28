package PizzaPricingStrategy.Decorators;

import PizzaPricingStrategy.Pizza;
import PizzaPricingStrategy.PizzaDecorator;

public class ChickenDecorator extends PizzaDecorator {

    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", chicken";
    }

    @Override
    public String getAllergens() {
        return pizza.getAllergens() + ", meat";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.5;
    }
}

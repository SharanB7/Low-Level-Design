package PizzaPricingStrategy.Decorators;

import PizzaPricingStrategy.Pizza;
import PizzaPricingStrategy.PizzaDecorator;

public class PestoDecorator extends PizzaDecorator {

    public PestoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", pesto sauce";
    }

    @Override
    public String getAllergens() {
        return pizza.getAllergens() + ", tree nuts";
    }
}

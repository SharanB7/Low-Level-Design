package PizzaPricingStrategy.Decorators;

import PizzaPricingStrategy.Pizza;
import PizzaPricingStrategy.PizzaDecorator;

public class JalapenoDecorator extends PizzaDecorator {

    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", jalapeno";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2;
    }

}

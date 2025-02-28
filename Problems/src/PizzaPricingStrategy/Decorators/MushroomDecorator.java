package PizzaPricingStrategy.Decorators;

import PizzaPricingStrategy.Pizza;
import PizzaPricingStrategy.PizzaDecorator;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", mushroom";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.5;
    }
}

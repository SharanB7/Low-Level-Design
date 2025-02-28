package PizzaPricingStrategy;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public String getAllergens() {
        return pizza.getAllergens();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

}

package PizzaPricingStrategy;

public class CheesePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Hand tossed base with cheese";
    }

    @Override
    public String getAllergens() {
        return "Contains gluten, milk, cheese";
    }

    @Override
    public double getPrice() {
        return 12;
    }
}

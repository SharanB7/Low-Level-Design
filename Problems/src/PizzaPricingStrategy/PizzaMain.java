package PizzaPricingStrategy;

import PizzaPricingStrategy.Decorators.*;

public class PizzaMain {

    public static void invoke() {
        Pizza cheesePizza = new CheesePizza();
        System.out.println("Description: " + cheesePizza.getDescription());
        System.out.println("Allergens: " + cheesePizza.getAllergens());
        System.out.println("Price: $" + cheesePizza.getPrice());
        System.out.println();

        Pizza customPizza1 = new ChickenDecorator(new CheesePizza());
        System.out.println("Description: " + customPizza1.getDescription());
        System.out.println("Allergens: " + customPizza1.getAllergens());
        System.out.println("Price: $" + customPizza1.getPrice());
        System.out.println();

        Pizza customPizza2 = new PestoDecorator(new MushroomDecorator(new CheesePizza()));
        System.out.println("Description: " + customPizza2.getDescription());
        System.out.println("Allergens: " + customPizza2.getAllergens());
        System.out.println("Price: $" + customPizza2.getPrice());
        System.out.println();

        Pizza customPizza3 = new MushroomDecorator(new ChickenDecorator(new JalapenoDecorator(new CheesePizza())));
        System.out.println("Description: " + customPizza3.getDescription());
        System.out.println("Allergens: " + customPizza3.getAllergens());
        System.out.println("Price: $" + customPizza3.getPrice());
        System.out.println();
    }

}
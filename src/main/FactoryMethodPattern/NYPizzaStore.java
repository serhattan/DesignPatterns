package main.FactoryMethodPattern;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            // @TODO implement NYStylePepperoniPizza class
            // pizza = new NYStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            // @TODO implement NYStyleVeggiePizza class
            // pizza = new NYStyleVeggiePizza();
        } else {
            return null;
        }

        return pizza;
    }
}

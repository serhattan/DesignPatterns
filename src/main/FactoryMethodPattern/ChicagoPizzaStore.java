package main.FactoryMethodPattern;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            // @TODO implement ChicagoStylePepperoniPizza class
            // pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            // @TODO implement ChicagoStyleVeggiePizza class
            // pizza = new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }

        return pizza;
    }
}

package main.FactoryMethodPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Walter ordered a " + pizza.getName() + "\n");

        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("White ordered a " + pizza.getName() + "\n");
    }
}

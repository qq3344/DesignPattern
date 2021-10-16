package factory.method;

public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeFactory getCoffeeFactory() {
        return coffeeFactory;
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee createCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}

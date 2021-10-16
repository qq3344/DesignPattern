package factory.simple;

public class CoffeeStore {
    public Coffee orderCoffee(Class<? extends Coffee> clazz) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(clazz);
        //加配料
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}

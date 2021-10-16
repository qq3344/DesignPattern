package wrapper;

/**
 * 装饰着
 */
public class Decorator extends MikeTea{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int cost() {
        return drink.cost();
    }
}

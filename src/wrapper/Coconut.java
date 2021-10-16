package wrapper;

/**
 * 具体装饰者
 */
public class Coconut extends Decorator{

    public Coconut(Drink drink) {
        super(drink);
        setPrice(3);
    }

    @Override
    public int cost() {
        return super.cost() + super.getPrice();
    }
}

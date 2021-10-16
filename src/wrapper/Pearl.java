package wrapper;

public class Pearl extends Decorator{

    public Pearl(Drink drink) {
        super(drink);
        setPrice(2);
    }

    @Override
    public int cost() {
        return super.cost() + this.getPrice();
    }
}

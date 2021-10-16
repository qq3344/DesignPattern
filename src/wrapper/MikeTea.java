package wrapper;

/**
 * 具体构件
 */
public class MikeTea extends Drink{

    public MikeTea() {
        setPrice(10);
    }

    @Override
    public int cost() {
        return super.getPrice();
    }
}

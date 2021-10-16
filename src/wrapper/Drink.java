package wrapper;

/**
 * 抽象构件
 */
public abstract class Drink {
    private int price;

    public abstract int cost();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package wrapper;

import java.io.DataInputStream;

public class Test {
    public static void main(String[] args) {
        Drink order = new MikeTea();
        order = new Pearl(order);
        order = new Coconut(order);
        System.out.println(order.cost());
    }
}

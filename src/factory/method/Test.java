package factory.method;

/**
 * 工厂方法模式
 * 复合了开闭原则 即扩展一个新的品类只需要去实现工厂接口即可
 */
public class Test {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setCoffeeFactory(new LatteCoffeeFactory());
        Coffee coffee = store.createCoffee();
        System.out.println(coffee.getName());
    }
}

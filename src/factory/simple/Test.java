package factory.simple;

/**
 * 不符合开闭原则 即对扩展开放 对修改关闭
 * 当产品增多又需要去工厂内添加新的类型
 */
public class Test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee(AmericanCoffee.class);
        System.out.println(coffee.getName());
    }
}

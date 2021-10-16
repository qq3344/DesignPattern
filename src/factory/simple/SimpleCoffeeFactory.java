package factory.simple;

/**
 *简单工厂
 */
public class SimpleCoffeeFactory {
    /**
     * 将该方法设置为静态的就实现了静态工厂模式
     * @param clazz
     * @return
     */
    public Coffee createCoffee(Class<? extends Coffee> clazz) {
        Coffee coffee = null;
        if(clazz.isAssignableFrom(AmericanCoffee.class)) {
            coffee = new AmericanCoffee();
        }else if(clazz.isAssignableFrom(LatteCoffee.class)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有你想要的咖啡");
        }
        return coffee;
    }
}

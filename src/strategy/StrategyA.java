package strategy;

/**
 * 具体策略类，封装算法的
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}

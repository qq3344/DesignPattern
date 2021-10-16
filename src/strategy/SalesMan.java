package strategy;

/**
 * 具体环境类(context) 这里为销售员
 */
public class SalesMan {
    //聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //销售员展示促销活动
    public void salesManShow() {
        strategy.show();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

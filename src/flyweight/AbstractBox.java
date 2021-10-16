package flyweight;

/**
 * 抽象享元角色
 */
public abstract class AbstractBox {
    //获取图形的方法 定义为抽象 因为只有子类实现了才能知道有多少图形
    public abstract String getShape();
    //显示图形及颜色
    public void display(String color) {
        System.out.println("方块形状：" + getShape() + ", 颜色: " + color);
    }
}

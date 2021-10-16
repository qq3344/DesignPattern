package flyweight;

/**
 * 俄罗斯方块案例  多个形状多个颜色使用同一个对象 不造成资源浪费
 * 外部状态为形状颜色  内部状态会图形对象
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox iBox = factory.getShape("I");
        iBox.display("red");
        AbstractBox lBox = factory.getShape("L");
        lBox.display("black");
        AbstractBox lBox2 = factory.getShape("L");
        lBox2.display("blue");
        System.out.println("L形状对象是否相等: " + (lBox == lBox2) + "");


    }
}

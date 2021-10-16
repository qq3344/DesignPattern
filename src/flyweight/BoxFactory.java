package flyweight;

import java.util.HashMap;

/**
 * 工厂类
 */
public class BoxFactory { //线程池
    //不是懒加载 属于饿汉式
    private static BoxFactory instance = new BoxFactory();
    private HashMap<String, AbstractBox> map;

    //进行初始化 单例模式 私有构造
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
    }

    public static BoxFactory getInstance() {
        return instance;
    }

    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}

package factory.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class CoffeeFactory {
    //加载配置文件，获取全类名并创建
    //1.定义容器存储咖啡对象
    private static Map<String, Coffee> container = new HashMap<>();
    //2.加载配置文件
    static {
        Properties prop = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("factory-config.properties");
        try {
            prop.load(is);
            Set<Object> set = prop.keySet();
            for (Object key : set) {
                String className = prop.getProperty((String)key);
                //反射创建对象，获取字节码
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee)clazz.newInstance();
                container.put((String) key, coffee);
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据名称获取对象
     * @param name
     * @return
     */
    public static Coffee createCoffee(String name) {
        return container.get(name);
    }
}

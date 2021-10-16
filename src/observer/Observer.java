package observer;

/**
 * 抽象观察者
 */
public interface Observer {
    //参数为主题推送的内容
    void update(String message);
}

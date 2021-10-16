package observer;

/**
 * 抽象主题角色类
 */
public interface Subject {
    //添加订阅者
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String message);
}

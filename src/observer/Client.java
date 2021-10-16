package observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new SubscriptionSubject();
        subject.attach(new WechatUser("A"));
        subject.attach(new WechatUser("B"));
        subject.attach(new WechatUser("C"));

        subject.notify("更新了....");
    }
}

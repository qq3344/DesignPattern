package factory.method;

public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("addSugar");
    }
    public void addMike() {
        System.out.println("addMike");
    }
}

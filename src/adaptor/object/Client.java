package adaptor.object;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String s = computer.readSD(sdCard);
        System.out.println(s);
        //从TF卡中读取数据
        String s1 = computer.readSD(new SDAdaptTF(new TFCardImpl()));
        System.out.println(s1);
    }
}

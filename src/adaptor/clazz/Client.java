package adaptor.clazz;

import com.oracle.webservices.internal.impl.internalspi.encoding.StreamDecoder;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String s = computer.readSD(sdCard);
        System.out.println(s);
        //从TF卡中读取数据
        String s1 = computer.readSD(new SDAdaptTF());
        System.out.println(s1);
    }
}

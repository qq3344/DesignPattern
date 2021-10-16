package adaptor.clazz;

public class Computer {
    //该计算机只能读取SD卡
    public String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }
}

package adaptor.object;

/**
 * 目标接口 也就是原本业务所支持的接口
 */
public interface SDCard {
    String readSD();
    void writeSD(String data);
}

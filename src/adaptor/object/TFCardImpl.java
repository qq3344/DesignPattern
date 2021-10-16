package adaptor.object;

/**
 * 适配者类的接口
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TF卡读取数据";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("TF写数据：" + data);
    }
}

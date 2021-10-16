package adaptor.clazz;

/**
 * 适配器类
 */
public class SDAdaptTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("适配器:");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("适配器:");
        writeTF(data);
    }
}

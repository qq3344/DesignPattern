package adaptor.object;


public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SD卡读取数据";
    }

    @Override
    public void writeSD(String data) {
        System.out.println("SD写数据：" + data);
    }
}

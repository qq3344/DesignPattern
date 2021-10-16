package adaptor.object;

/**
 * 适配器类
 * 将继承改为集合减少耦合 如果读SD不是一个接口而是一个类也能实现适配 ps：父类只能继承一个
 */
public class SDAdaptTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdaptTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("适配器:");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("适配器:");
        tfCard.writeTF(data);
    }
}

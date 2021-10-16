package factory.abstruct;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        //生产出休闲风格的衣服
        BrandFactory factory = new SportsStyleFactory();
        Coat coat = factory.createCoat();
        Pants pants = factory.createPants();

        coat.show();
        pants.show();

    }
}

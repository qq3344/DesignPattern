package factory.abstruct;

public class LeisureStyleFactory implements BrandFactory{
    @Override
    public Pants createPants() {
        return new LoosePants();
    }

    @Override
    public Coat createCoat() {
        return new LooseCoat();
    }
}

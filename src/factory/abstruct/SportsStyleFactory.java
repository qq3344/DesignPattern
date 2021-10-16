package factory.abstruct;

public class SportsStyleFactory implements BrandFactory{
    @Override
    public Pants createPants() {
        return new SportsPants();
    }
    @Override
    public Coat createCoat() {
        return new SportsCoat();
    }
}

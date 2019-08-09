package hw1;

public class BasicCatFactory extends CatFactory {
    @Override
    public Cat createCat() {
        return new BasicCat();
    }
}

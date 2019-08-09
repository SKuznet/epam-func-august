package hw1;

public class LuxuryCatFactory extends CatFactory {
    @Override
    public Cat createCat() {
        return new LuxuryCat();
    }
}

package homeworks.homework1;

public class BlackCatFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new BlackCat();
    }
}

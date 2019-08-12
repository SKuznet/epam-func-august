package homeworks.homework1;

public class RedCatFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new RedCat();
    }
}

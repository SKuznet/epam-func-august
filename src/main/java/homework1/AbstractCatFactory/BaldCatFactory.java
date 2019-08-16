package homework1.AbstractCatFactory;

public class BaldCatFactory implements CatFactory {
    @Override
    public CatColor addColor(Color color) {
        switch (color) {
            case BLACK:
                return new BlackCat();
            case WHITE:
                return new WhiteCat();
            default:
                return new BlackCat();
        }
    }

    @Override
    public CatHairness addHairness() {
        return new BaldCat();
    }
}

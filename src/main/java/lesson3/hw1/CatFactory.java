package lesson3.hw1;

public class CatFactory {
    public Cat getCat(CatBreeds breed) {
        Cat toReturn = null;
        switch (breed) {
            case ABYSSINIAN:
                toReturn = new AbyssinianCat();
                break;
            case OCICAT:
                toReturn = new OcicatCat();
                break;
            case BALINESE:
                toReturn = new BalineseCat();
                break;
            default:
                throw new IllegalArgumentException("Wrong cat breed: " + breed);
        }
        return toReturn;
    }
}

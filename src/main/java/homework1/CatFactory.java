package homework1;

public class CatFactory {
    public Cat createCat(String name, String breed, int weight, int age, String ownerName) {
        switch (breed) {
            case "Maine Coon":
                return new CatMaineCoon(name, weight, age, ownerName);
            case "Russian Blue":
                return new CatRussianBlue(name, weight, age, ownerName);
            case "Siamese":
                return new CatSiamese(name, weight, age, ownerName);
            default:
                throw new IllegalArgumentException("Not existing cat");
        }
    }
}

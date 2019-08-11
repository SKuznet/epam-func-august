package homework1;

/**
 * Factory returns Cat class instances based on the breed parameter.
 */
public class CatFactory {
    public Cat createCat(String breed, String name, boolean isHungry, boolean isHerbivore) {
        switch (breed) {
            case "Abyssinian":
                return new AbyssinianCat(name, isHungry, isHerbivore);
            case "Sphynx":
                return new SphynxCat(name, isHungry, isHerbivore);
            default:
                throw new IllegalArgumentException("This cat doesn't exist");
        }
    }
}

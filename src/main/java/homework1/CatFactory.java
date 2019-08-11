package homework1;

import homework1.cats.Barsik;
import homework1.cats.Cat;
import homework1.cats.Mursik;

public class CatFactory {
    public Cat createCat(String name) {
        switch (name) {
            case ("Barsik"):
                return new Barsik(name, 2);
            case ("Mursik"):
                return new Mursik(name, 3);
            default:
                throw new IllegalArgumentException("Not a cat");
        }
    }
}

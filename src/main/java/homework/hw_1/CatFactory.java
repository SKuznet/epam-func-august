package homework.hw_1;

import homework.hw_1.cats.Cat;
import homework.hw_1.cats.Mursik;
import homework.hw_1.cats.Barsik;

public class CatFactory {
    public static Cat createCat(String name) {
        switch (name) {
            case "Barsik":
                return new Barsik(name, 1, true, true);
            case "Mursik":
                return new Mursik(name, 2, false, false);
            default:
                throw new IllegalArgumentException("Cat not found");
        }
    }
}

package lesson3.hw;

import lesson3.hw.cats.Barsik;
import lesson3.hw.cats.Cat;
import lesson3.hw.cats.Mursik;

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

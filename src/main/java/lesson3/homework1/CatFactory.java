package lesson3.homework1;

import lesson3.homework1.cats.Bars;
import lesson3.homework1.cats.Cat;
import lesson3.homework1.cats.Murz;

public class CatFactory {

    public static Cat createCat(String name){
        switch (name) {
            case "Barsik":
                return new Bars(name, 1, true, true);
            case "Mursik":
                return new Murz(name, 2, false, false);
            default:
                throw new IllegalArgumentException("Cat not found");
        }
    }
}

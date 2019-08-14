package hw1;

import hw1.Cats.Barsik;
import hw1.Cats.Murzik;
import hw1.Cats.NoNameCat;

public class CatFactory {

    public static Cat getCat(String name) {
        switch (name) {
            case "Barsik":
                return new Barsik();
            case "Murzik":
                return new Murzik();
            default:
                return new NoNameCat();
        }
    }

}

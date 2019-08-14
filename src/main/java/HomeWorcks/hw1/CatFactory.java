package HomeWorcks.hw1;

import HomeWorcks.hw1.Cats.Barsik;
import HomeWorcks.hw1.Cats.Murzik;
import HomeWorcks.hw1.Cats.NoNameCat;

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

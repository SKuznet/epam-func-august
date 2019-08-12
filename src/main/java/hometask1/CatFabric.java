package hometask1;

import hometask1.cats.AbstractCat;
import hometask1.cats.FreshmanCat;
import hometask1.cats.HappyCat;
import hometask1.cats.RudeCat;

public class CatFabric {
    private AbstractCat abstractCat;

    public AbstractCat getAbstractCat(String mood) {
        if (mood.equalsIgnoreCase("happy")) {
            abstractCat = new HappyCat("Barsik", "happy cat");
        } else if (mood.equalsIgnoreCase("freshman")) {
            abstractCat = new FreshmanCat("Pochta", "freshman");
        } else if (mood.equalsIgnoreCase("rude")) {
            abstractCat = new RudeCat("Grizli", "rude");
        }
        return abstractCat;
    }
}

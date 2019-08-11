package homework.task1;

import homework.task1.cats.Cat;
import homework.task1.cats.John;
import homework.task1.cats.Rick;

public class CatFabric {
    public Cat createCat(final String name) {
        if (name.equalsIgnoreCase("John")) {
            return new John(name, true);
        } else if (name.equalsIgnoreCase("Rick")) {
            return new Rick(name, false);
        } else {
            throw new IllegalArgumentException("no such cat");
        }
    }
}

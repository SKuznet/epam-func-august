package hw1;

import lesson2.cats.Cat;

public class CatGenerator {

    public Cat getCat() {

        return new Cat("Cat", false, false);
    }

    public Cat getCat(String name) {
        switch (name.toLowerCase()) {
            case "murzik":
                return new Cat("Murzik", true, true);
            case "barsik":
                return new Cat("Barsik", true, false);
            default:
                return new Cat("Pushok", false, true);
        }
    }
}

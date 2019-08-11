package hometasks.hometask1;

import hometasks.hometask1.Cats.AbyssinianCat;
import hometasks.hometask1.Cats.AegeanCat;

class CatFactory {

    static Cat createCat(String name, int age, String breed) {
        switch (breed.toLowerCase()) {
            case "abyssinian":
                return new AbyssinianCat(name, age);

            case "aegean":
                return new AegeanCat(name, age);

            default:
                throw new IllegalArgumentException("unknown breed");
        }
    }
}

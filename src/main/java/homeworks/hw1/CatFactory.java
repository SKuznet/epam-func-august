package homeworks.hw1;

import homeworks.hw1.cats.*;

public class CatFactory {
    public Cat getCat(String input) {
    Cat cat = null;
    input = input.toLowerCase();
    switch (input) {
        case "catpet": cat = new CatPet();
        break;
        case "lion": cat = new Lion();
            break;
        case "tiger": cat = new Tiger();
            break;
        case "puma": cat = new Puma();
            break;
        case "toycat" : cat = new ToyCat();
            break;
        default:
            System.err.println("This kind of cat (" + input + ") not supported now.");
    }
    return cat;
    }
}

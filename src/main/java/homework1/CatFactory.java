package homework1;

import homework1.Cats.Boris;
import homework1.Cats.Cat;
import homework1.Cats.Vasilii;

public class CatFactory {
    public Cat createCat(String name){
        switch (name){
            case "Boris" : return new Boris(name, "grey", false, false);
            case "Vasilii" : return new Vasilii(name, "white", true, false);
            default: return new Cat(name, "default", false, false);
        }
    }
}

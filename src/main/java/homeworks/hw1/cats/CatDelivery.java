package homeworks.hw1.cats;

import homeworks.hw1.CatFactory;

import java.util.ArrayList;
import java.util.List;

public class CatDelivery {

    public static List getCats(){
        CatFactory catFactory = new CatFactory();
        List<Cat> catList = new ArrayList<>();
        catList.add(catFactory.getCat("CatPet"));
        catList.add(catFactory.getCat("Tiger"));
        catList.add(catFactory.getCat("Lion"));
        catList.add(catFactory.getCat("Puma"));
        catList.add(catFactory.getCat("ToyCat"));
        return catList;
    }
}

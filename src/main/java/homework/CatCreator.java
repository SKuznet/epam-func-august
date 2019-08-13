package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CatCreator {

    public static List<MyCat> catCreator(int countOfCats){
        if (countOfCats > 8){
            System.out.println("Invalid count of cats");
            return null;
        }
        List<MyCat> myCatList = new ArrayList<>();
        List<String> catNames = new ArrayList<>();
        catNames.add("First_Kitty");
        catNames.add("Second_Kitty");
        catNames.add("Third_Kitty");
        catNames.add("Fourth_Kitty");
        catNames.add("Fifth_Kitty");
        catNames.add("Sixth_Kitty");
        catNames.add("Seventh_Kitty");
        catNames.add("Eighth_Kitty");

        for (int i = 0; i < countOfCats; i++) {
            boolean isHerbivore = (i % 3 == 0);
            String tempName = catNames.get(new Random().nextInt(7));
            int catAge = new Random().nextInt(20);
            myCatList.add(new MyCat(tempName, catAge, i, isHerbivore));
        }
        
        return myCatList;
    }

    public static void catPrinter(List<MyCat> myCatList){
        for (MyCat mycat: myCatList) {
            System.out.printf(mycat.toString());
            System.out.println();
            System.out.println("__________________________________________");
        }
    }
}

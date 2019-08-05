package lesson1;

public class CatLogic {

    public int getCatCount(String catName, String catWoman){
        if(catName != null && catName.equalsIgnoreCase("Barsik") && catWoman != null){
            return 2;
        } else if (catName == null && catWoman != null || catName!= null && catWoman == null) {
            return 1;
        } else if (catName != null && catName.equalsIgnoreCase("Murzik") && catWoman != null){
            return 10;
        } else {
            throw new IllegalArgumentException("Cat name " + catName + " and catWoman " + catWoman  + " name is incorrect");
        }
    }
}

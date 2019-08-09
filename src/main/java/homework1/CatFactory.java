package homework1;

public class CatFactory {

    public static Cat createCat (String name, String color, int age, String favoriteFood){
        return new Cat(name, color, age, favoriteFood);
    }

    public static Cat createCat(String name){
        return new Cat(name, "gray-brown-raspberry", 1, "any food");
    }
}

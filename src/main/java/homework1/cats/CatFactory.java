package homework1.cats;

public class CatFactory {
    public static Cat getCat(String name){
        return new Cat(name);
    }
}

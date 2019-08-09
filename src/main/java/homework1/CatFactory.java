package homework1;

public class CatFactory {
    public static Cat getCat(String name){
        return new Cat(name);
    }
}

package homework1;

public class CatFactory {
    public static Cat getCat(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        return new Cat(name);
    }
}

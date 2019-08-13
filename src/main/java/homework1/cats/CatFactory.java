package homework1.cats;

/**
 * Creates new object of Cat class.
 */
public class CatFactory {
    /**
     * Creates new Cat class object
     * @param name Cat name
     * @return Cat class instance
     */
    public static Cat getCat(String name){
        return new Cat(name);
    }
}

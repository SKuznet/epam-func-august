package hw1.cats;

public class CatFactory {
    /**
     * Factory returns new get by given name
     * @param name Desired name for a new cat
     * @return new cat with given name
     */
    public static Cat getCat(String name){
        return new Cat(name);
    }
}

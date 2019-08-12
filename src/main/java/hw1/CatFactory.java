package hw1;

public class CatFactory {

    public Cat getCat(Cats cats) {
        return cats.getInstance();
    }
}

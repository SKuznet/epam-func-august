package hometask1.cats;

public abstract class AbstractCat implements CatService {
    protected String name;
    protected String mood;

    public AbstractCat(String name, String mood) {
        this.name = name;
        this.mood = mood;
    }
}

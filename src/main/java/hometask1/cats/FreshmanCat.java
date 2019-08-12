package hometask1.cats;

public class FreshmanCat extends AbstractCat {

    public FreshmanCat(String name, String mood) {
        super(name, mood);
    }

    public String sayHi() {
        return "Hi there! I am a new here!";
    }

    public String sayBye() {
        return "Bye everyone!";
    }

    @Override
    public String toString() {
        return "Hello, my name is " + super.name +
                "and I'm a" + super.mood;
    }
}

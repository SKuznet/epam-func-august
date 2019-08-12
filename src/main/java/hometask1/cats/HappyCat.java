package hometask1.cats;

public class HappyCat extends AbstractCat {

    public HappyCat(String name, String mood) {
        super(name, mood);
    }

    public String sayHi() {
        return "Hi bro, how do you do man?";
    }

    public String sayBye() {
        return "Hey, you still here, lets go home!";
    }

    @Override
    public String toString() {
        return "Hello, my name is " + super.name +
                "and I'm a" + super.mood;
    }
}

package hometask1.cats;

public class RudeCat extends AbstractCat {
    public RudeCat(String name, String mood) {
        super(name, mood);
    }

    public String sayHi() {
        return "Hello lazy buts!***whispers...soo ruuude!";
    }

    public String sayBye() {
        return "Pfff...who is go home, I'm go home, hah!";
    }

    @Override
    public String toString() {
        return "Hello, my name is " + super.name +
                "and I'm a" + super.mood;
    }
}

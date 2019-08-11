package homework1.cats;

public class Barsik extends Cat {
    private boolean isHerbivore = false;

    public Barsik(String name, int age) {
        super(name, age);
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }
}

package homework1.cats;

public class Mursik extends Cat {
    private boolean isHerbivore = true;

    public Mursik(String name, int age) {
        super(name, age);
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }
}

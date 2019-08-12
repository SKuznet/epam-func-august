package homeworks.hw1;

public class Munchkin extends Cat {
    public Munchkin(String name) {
        super(name);
    }

    @Override
    public void tellAboutYourself() {
        System.out.println("Hi, my name is " + getName() + ", i'm a little cat, and i'm munchkin with ginger wool.");
    }
}

package homeworks.hw1;

public class British extends Cat {
    public British(String name) {
        super(name);
    }

    @Override
    public void tellAboutYourself() {
        System.out.println("Hi, my name is " + getName() + ", i'm a middle cat, and i'm british cat with grey wool.");
    }
}

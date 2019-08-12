package homeworks.hw1;

public class MaineCoon extends Cat {
    public MaineCoon(String name) {
        super(name);
        setBiggest(true);
    }

    @Override
    public void tellAboutYourself() {
        System.out.println("Hi, my name is " + getName() + ", i'm a big cat, and i'm maine coon with multicolor wool.");
    }
}

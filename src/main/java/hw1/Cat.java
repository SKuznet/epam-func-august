package hw1;

public class Cat implements Animal {
    private final String MEOW = "Meow";

    @Override
    public void run() {
        System.out.println(MEOW);
    }

    @Override
    public int legs() {
        return 4;
    }
}

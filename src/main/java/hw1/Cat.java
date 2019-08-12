package hw1;

public class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("I'm a cat, I can climb to roof");
    }

    @Override
    public int legs() {
        return 4;
    }
}

package hw1;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("I'm dog,I can run fast");
    }

    @Override
    public int legs() {
        return 5;
    }
}

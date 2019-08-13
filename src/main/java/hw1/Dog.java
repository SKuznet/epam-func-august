package hw1;

import java.util.Objects;

public class Dog implements Animal {
    private final String MEOW = "Gav";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(MEOW, dog.MEOW);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MEOW);
    }

    @Override
    public void run() {
        System.out.println("I'm dog,I can run fast");
    }

    @Override
    public int legs() {
        return 5;
    }
}

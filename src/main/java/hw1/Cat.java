package hw1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(MEOW, cat.MEOW);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MEOW);
    }
}

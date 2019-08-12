package hw_01;

import java.util.Objects;

public class Cat {
    protected String state;
    protected String name;

    public Cat(String name) {
        this(name, "default cat");
    }

    public Cat(String name, String state) {
        if (name == null || state == null) {
            throw new NullPointerException();
        }
        this.state = state;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "state='" + state + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return state.equals(cat.state) &&
                name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, name);
    }
}

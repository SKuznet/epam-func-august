package hw_01;

public class Cat {
    protected String state;
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String state) {
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
}

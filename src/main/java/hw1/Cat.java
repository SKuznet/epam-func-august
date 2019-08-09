package hw1;

public abstract class Cat {

    protected String name;
    protected boolean breed;
    protected String description;

    public String getName() {
        return name;
    }

    public boolean isBreed() {
        return breed;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", description='" + description + '\'' +
                '}';
    }
}

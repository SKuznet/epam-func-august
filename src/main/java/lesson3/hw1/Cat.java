package lesson3.hw1;

public abstract class Cat {

    protected String name;
    protected String breed;
    protected String country;
    protected boolean isAlive;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getCountry() {
        return country;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", country='" + country + '\'' +
                '}';
    }
}

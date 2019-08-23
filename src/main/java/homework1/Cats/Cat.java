package homework1.Cats;

public class Cat {
    private String name;
    private String color;
    private boolean isHungry;
    private boolean isHerbivore;

    public Cat(String name, String color, boolean isHungry, boolean isHerbivore) {
        this.name = name;
        this.color = color;
        this.isHungry = isHungry;
        this.isHerbivore = isHerbivore;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
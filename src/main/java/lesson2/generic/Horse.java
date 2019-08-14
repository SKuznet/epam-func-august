package lesson2.generic;

public class Horse {
    private int speed;
    private String name;
    private boolean isHungry;
    private boolean isHerbivore;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }

    public Horse(int speed, String name, boolean isHungry, boolean isHerbivore) {
        this.speed = speed;
        this.name = name;
        this.isHungry = isHungry;
        this.isHerbivore = isHerbivore;
    }
}

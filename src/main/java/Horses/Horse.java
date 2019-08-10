package Horses;

public class Horse {
    private int speed;
    private boolean isHungry;
    private String name;
    private boolean isHerbivore;

    public Horse(int speed, boolean isHungry, String name, boolean isHerbivore) {
        this.speed = speed;
        this.isHungry = isHungry;
        this.name = name;
        this.isHerbivore = isHerbivore;
    }


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
}

package generic;

public class Horse {
    private int speed;
    private String name;
    private boolean isHungry;
    private boolean isHarbyvore;

    public Horse(int speed, String name, boolean isHungry, boolean isHarbyvore) {
        this.speed = speed;
        this.name = name;
        this.isHungry = isHungry;
        this.isHarbyvore = isHarbyvore;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public boolean isHarbyvore() {
        return isHarbyvore;
    }

    public void setHarbyvore(boolean harbyvore) {
        isHarbyvore = harbyvore;
    }
}

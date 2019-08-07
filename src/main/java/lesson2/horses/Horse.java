package lesson2.horses;

public class Horse {
  private int speed;
  private String name;
  private boolean isHungry;
  private boolean isHerbivore;

  public Horse(int speed, String name, boolean isHungry, boolean isHerbivore) {
    this.speed = speed;
    this.name = name;
    this.isHungry = isHungry;
    this.isHerbivore = isHerbivore;
  }

  public int getSpeed() {
    return speed;
  }

  public String getName() {
    return name;
  }

  public boolean isHungry() {
    return isHungry;
  }

  public boolean isHerbivore() {
    return isHerbivore;
  }
}

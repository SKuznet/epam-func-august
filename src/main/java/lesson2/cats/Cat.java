package lesson2.cats;

public class Cat {
  String name;
  boolean isHungry;
  boolean isHerbivore;

  public String getName() {
    return name;
  }

  public boolean isHungry() {
    return isHungry;
  }

  public boolean isHerbivore() {
    return isHerbivore;
  }

  public Cat(String name, boolean isHungry, boolean isHerbivore) {
    this.name = name;
    this.isHungry = isHungry;
    this.isHerbivore = isHerbivore;
  }
}

package lesson3.hw;

public class Cat {

  private String name;
  private int height;
  private int weight;
  private boolean isAlive;


  private Cat(String name, int height, int weight, boolean isAlive) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.isAlive = isAlive;
  }

  public String getName() {
    return name;
  }

  public int getHeight() {
    return height;
  }

  public int getWeight() {
    return weight;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public static class God {

    private God() {
    }

    static Cat createCat(String name, int height, int weight, boolean isAlive) {
      return new Cat(name, height, weight, isAlive);
    }
  }
}

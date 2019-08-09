package homework1;

public class Cat {

    private String name;
    private String color;
    private int age;
    private String favoriteFood;

    public Cat(String name, String color, int age, String favoriteFood) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "The " + age + "-year-old cat called " + name + " with " + color + " fur really loves to eat " + favoriteFood;
    }
}

package homework1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color) &&
                Objects.equals(favoriteFood, cat.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age, favoriteFood);
    }
}

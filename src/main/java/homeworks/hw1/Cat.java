package homeworks.hw1;

import java.util.Objects;

public class Cat {
    private String name;
    private boolean biggest;

    public Cat(String name){
        this.name = name;
    }

    public void tellAboutYourself(){
        System.out.println("Hi, my name is " + name + ", i'm a middle cat, and i'm just a cat with multicolor wool.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBiggest() {
        return biggest;
    }

    public void setBiggest(boolean biggest) {
        this.biggest = biggest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

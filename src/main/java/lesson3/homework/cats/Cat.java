package lesson3.homework.cats;

import java.util.Objects;

public class Cat {

    private String name;
    private boolean playing = false;
    private boolean playingWithAnotherCat = false;

    public Cat(String name) {
        this.name = name;
    }

    public Cat play(){
        this.playing = true;
        return this;
    }

    public Cat play(Cat cat){
        this.playingWithAnotherCat = true;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", playing=" + playing +
                ", playingWithAnotherCat=" + playingWithAnotherCat +
                '}';
    }
}

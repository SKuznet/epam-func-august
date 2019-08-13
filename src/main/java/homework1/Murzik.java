package homework1;

import java.util.Objects;

public class Murzik implements Cat {
    private final String MEOW = "Meow from Murzik!";
    private String name;
    private boolean isHungry;
    private boolean isHerbivore;

    public Murzik(String name, boolean isHungry, boolean isHerbivore) {
        this.name = name;
        this.isHungry = isHungry;
        this.isHerbivore = isHerbivore;
    }

    @Override
    public void sayMeow() {
        System.out.println(MEOW);
    }

    @Override
    public String getMeow() {
        return MEOW;
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

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    @Override
    public String toString() {
        return "Murzik{" +
                "name='" + name + '\'' +
                ", isHungry=" + isHungry +
                ", isHerbivore=" + isHerbivore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Murzik murzik = (Murzik) o;
        return isHungry() == murzik.isHungry() &&
                isHerbivore() == murzik.isHerbivore() &&
                Objects.equals(MEOW, murzik.MEOW) &&
                Objects.equals(getName(), murzik.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(MEOW, getName(), isHungry(), isHerbivore());
    }
}
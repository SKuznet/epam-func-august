package homework1;

import java.util.Objects;

public class Barsik implements Cat {
    private final String MEOW = "Meow from Barsik!";
    private String name;
    private boolean isHungry;
    private boolean isHerbivore;

    public Barsik(String name, boolean isHungry, boolean isHerbivore) {
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
        return "Barsik{" +
                "name='" + name + '\'' +
                ", isHungry=" + isHungry +
                ", isHerbivore=" + isHerbivore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barsik barsik = (Barsik) o;
        return isHungry() == barsik.isHungry() &&
                isHerbivore() == barsik.isHerbivore() &&
                Objects.equals(MEOW, barsik.MEOW) &&
                Objects.equals(getName(), barsik.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(MEOW, getName(), isHungry(), isHerbivore());
    }
}

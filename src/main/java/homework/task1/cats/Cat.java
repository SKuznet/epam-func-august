package homework.task1.cats;

public class Cat {
    private String name;
    private boolean isHungry;

    public Cat(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(final boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

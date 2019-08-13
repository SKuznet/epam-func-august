package homework;

public class MyCat {
    private String name;
    private int age;
    private int catId;
    private boolean isHerbivore;

    public MyCat(String name, int age, int catId, boolean isHerbivore) {
        this.name = name;
        this.age = age;
        this.catId = catId;
        this.isHerbivore = isHerbivore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    @Override
    public String toString() {
        return "MyCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", catId=" + catId +
                ", isHerbivore=" + isHerbivore +
                '}';
    }
}

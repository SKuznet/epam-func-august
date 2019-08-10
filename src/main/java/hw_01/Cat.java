package hw_01;

public class Cat {
    protected static int count;
    protected int id;
    protected String state;
    protected String name;

    public Cat(String name) {
        this.name = name;
        id = ++count;
    }

    public Cat(String name,String state) {
        this.state = state;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

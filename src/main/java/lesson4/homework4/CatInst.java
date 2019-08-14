package lesson4.homework4;

public class CatInst {
    private String name;

    public CatInst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat's name is " + name;
    }
}
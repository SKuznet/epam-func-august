package homeworks.homework1;

public class BlackCat implements Cat {

    private String color;

    public BlackCat() {
        color = "Black";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Cat setColor(String s) {
        color=s;
        return this;
    }
}

package homeworks.homework1;

public class RedCat implements Cat {

    private String color;

    public RedCat() {
        color = "Red";
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


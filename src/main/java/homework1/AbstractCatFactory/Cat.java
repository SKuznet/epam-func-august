package homework1.AbstractCatFactory;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private List view = new ArrayList();

    public Cat(String name, CatFactory catFactory, Color color) {
        this.name = name;
        view.add(catFactory.addColor(color));
        view.add(catFactory.addHairness());
    }


    public Cat fight(Cat cat) {

        int random = (Math.random() <= 0.5) ? 1 : 2;

        if (random == 1) {
            return this;
        }

        return cat;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getView() {
        return view;
    }

    public void setView(List view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " and looks like: " + view;
    }
}

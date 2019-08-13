package hw1.Cats;

import hw1.Cat;

public class Barsik implements Cat {

    @Override
    public void sayName() {
        System.out.println("My name is Barsik!");
    }

    @Override
    public String name() {
        return "Barsik";
    }

}

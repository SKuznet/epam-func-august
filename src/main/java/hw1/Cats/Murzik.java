package hw1.Cats;

import hw1.Cat;

public class Murzik implements Cat {

    @Override
    public void sayName() {
        System.out.println("My name is Murzik!");
    }

    @Override
    public String name() {
        return "Murzik";
    }

}

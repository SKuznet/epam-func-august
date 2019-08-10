package hw_01.impl;

import hw_01.Cat;

public class GoodCat extends Cat {

    public GoodCat(String name) {
        super(name);
        state = "I am good cat";
    }

    public GoodCat(String name, String state) {
        super(name, state);
    }
}

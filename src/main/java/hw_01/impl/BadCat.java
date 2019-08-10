package hw_01.impl;

import hw_01.Cat;

public class BadCat extends Cat {
    public BadCat(String name) {
        super(name);
        state = "I am evil";
    }

    public BadCat(String name, String state) {
        super(name, state);
    }
}

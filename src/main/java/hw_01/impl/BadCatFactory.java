package hw_01.impl;

import hw_01.Cat;
import hw_01.Factory;

public class BadCatFactory implements Factory {
    @Override
    public Cat getCat(String name) {
        return new BadCat(name);
    }
}

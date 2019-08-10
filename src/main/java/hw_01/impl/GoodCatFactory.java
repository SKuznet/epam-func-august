package hw_01.impl;

import hw_01.Cat;
import hw_01.Factory;

public class GoodCatFactory implements Factory {

    @Override
    public Cat getCat(String name) {
        return new GoodCat(name);
    }
}

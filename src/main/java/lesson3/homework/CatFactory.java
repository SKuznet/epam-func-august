package lesson3.homework;

import lesson3.homework.cats.Cat;

public class CatFactory {

    public static Cat createCat(String name){
        return new Cat(name);
    }
}

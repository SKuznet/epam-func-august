package lesson3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> i.toString();
        System.out.println(function.apply(55).length());







    }
}

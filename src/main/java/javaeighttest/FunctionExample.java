package java8test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> integerFunction = s -> s.length() + 8;
        System.out.println(integerFunction.apply("Hello"));

        Function<String, String> stringFunction = String::toUpperCase;
        System.out.println(stringFunction.apply("Hello!"));

        BiFunction<String, String, String> stringBiFunction = String::concat;
        System.out.println(stringBiFunction.apply("ab", "cdef"));
    }
}

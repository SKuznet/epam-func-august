package lesson3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(function.apply("Functional interface Java 8"));
        Function<String, Integer> function1 = s -> s.length();
        System.out.println(function1.apply("Functional interface java 8"));


        BiFunction<String, String, String> biFunction1 = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        };
        BiFunction<String, String, String> biFunction = (s1, s2) -> s1.concat(s2);

        System.out.println(biFunction.apply("Functional interface ", "java 8"));
    }
}

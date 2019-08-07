package lesson2.fuction;

import java.util.function.BiFunction;

public class FuctionEx {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction1 = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        };
        BiFunction <String, String, String> biFunction = (s1, s2) -> s1.concat(s2);

        System.out.println(biFunction.apply("Functional interface", " java 8"));
    }
}

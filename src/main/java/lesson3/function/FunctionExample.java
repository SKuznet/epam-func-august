package lesson3.function;

import java.util.function.BiFunction;

public class FunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction1 = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length() + s2.length();
            }
        };
        String s1 = "length of this String is 27";
        String s2 = " the summ will be 47";
        System.out.println(s1 + s2 + " : " + biFunction1.apply(s1, s2));
        BiFunction<String, String, String> biFunction = (s3, s4) -> s3.concat(s4);
        System.out.println(biFunction.apply("Func inter", " Java 1.8"));

    }
}

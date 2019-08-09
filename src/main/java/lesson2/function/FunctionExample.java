package lesson2.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

  public static void main(String[] args) {
    Function<String, String> function = s -> s.toUpperCase();
    System.out.println(function.apply("Functional interface java 8"));
    Function<String, Integer> function1 = s -> s.length();
    System.out.println(function.apply("Functional interface java 8"));

    BiFunction<String, String, String> biFunction = (s1, s2) -> s1.concat(s2);
    System.out.println(biFunction.apply("Functional interface", " java 8"));
  }
}

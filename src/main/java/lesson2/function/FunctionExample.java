package lesson2.function;

import java.util.function.BiFunction;

public class FunctionExample {

  public static void main(String[] args) {
    BiFunction<String, String,String> biFunction = (s1, s2) -> s1.concat(s2);
    System.out.println(biFunction.apply("Functional interface", " java 8"));
  }

}

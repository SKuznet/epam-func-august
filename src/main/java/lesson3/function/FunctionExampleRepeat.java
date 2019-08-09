package lesson3.function;

import java.util.function.Function;

public class FunctionExampleRepeat {

  public static void main(String[] args) {
    Function<String, String> function = s -> s.replace("bad", "good");
    System.out.println(function.apply("bad time to be a hero"));
  }
}

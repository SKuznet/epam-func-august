package lesson4;

import java.util.function.Function;

public class FunctionCompExample {

  public static void main(String[] args) {
    Function<String, String> action = String::trim;
    String result = action.andThen(String::toLowerCase).andThen(StringBuilder::new)
        .andThen(StringBuilder::reverse).andThen(StringBuilder::toString).apply("    vKXDvcxD");
    System.out.println(result);
  }

}

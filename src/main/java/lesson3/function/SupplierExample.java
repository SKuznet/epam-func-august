package lesson3.function;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

  public static void main(String[] args) {
    Supplier<String> supplier = () -> "Functional interface java 8";
    System.out.println(supplier.get());

    Supplier<String[]> supplier1 = () -> new String[]{"Barsik", "Murzik"};
    System.out.println(Arrays.toString(supplier1.get()));
  }
}

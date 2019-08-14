package lesson5;

import java.util.Optional;

public class OptionalExample {

  //NullPointerException
  public static void main(String[] args) {
//    Optional<String> optional = Optional.ofNullable(null);

//    System.out.println(optional.isPresent());

    String example = null;

    if (example != null) {
      System.out.println("asasdasd");
    } else {
      System.out.println("Example is null");
    }
    Optional<String> optional = Optional.ofNullable(null);

    if (optional.isPresent()) {
      System.out.println("asdaasd");
    } else {
      System.out.println("Something is null");
    }

    optional.ifPresent((s) -> System.out.println(s.charAt(0)));
  }

}

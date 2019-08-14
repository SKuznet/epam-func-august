package lesson5;

import java.util.Optional;

public class OptionalEx2 {

  public static void main(String[] args) {
    Optional<String> gender = Optional.of("MALE");

    String answer1 = "Yes";
    String answer2 = null;

    System.out.println("Non-empty optional: " + gender);
    System.out.println("Non-empty optional: " + gender.get());
    System.out.println("Empty Optional: " + Optional.empty());

    System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
    System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer2));

    System.out.println("ofNullable on Non-Empty optional: " + Optional.of(answer2));
  }
}

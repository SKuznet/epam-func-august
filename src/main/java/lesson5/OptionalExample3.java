package lesson5;

import java.util.Optional;

public class OptionalExample3 {

  public static void main(String[] args) {
    Optional<String> gender = Optional.of("MALE");
    Optional<String> emptyGender = Optional.empty();

    System.out.println(gender.filter(g -> g.equalsIgnoreCase("male")));
    System.out.println(gender.filter(g -> g.equals("male")));
    System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE")));

    if(gender.isPresent()){
      System.out.println("Value available");
    } else {
      System.out.println("Value not available");
    }

    gender.ifPresent(g -> System.out.println());

  }

}

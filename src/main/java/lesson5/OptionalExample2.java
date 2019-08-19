package lesson5;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");

        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-empty optional: " + gender);
        System.out.println("Non-empty optional: Gender value " + gender.get());

    }
}

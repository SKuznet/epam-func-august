package lesson5;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("Male");

        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-empty optional:" + gender);
        System.out.println("Non-empty optional: Gender value" + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("offNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("offNullable on Empty Optional: " + Optional.ofNullable(answer2));
    }
}

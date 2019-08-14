package lesson5;

import java.util.Optional;

public class OptionalExample {
    //NPE

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());

        String example = null;

        if (example != null) {
            System.out.println("Here!");
        } else {
            System.out.println("Example is null");
        }

        Optional<String> optional1 = Optional.of("Barsik");

        if (optional1.isPresent()) {
            System.out.println("Here!");
        } else {
            System.out.println("Something is null!");
        }

        System.out.println(optional1.orElse("Miss"));

        Optional<String> optional2 = Optional.of("Barsik");
        optional2.ifPresent((s) -> System.out.println(s.charAt(0)));
    }

}

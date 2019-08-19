package lesson5;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Barsik");

        if (optional.isPresent()) {
            System.out.println("ddf");
        } else {
            System.out.println("smth is null");
        }
        System.out.println(optional.orElse("Barrs"));

        optional.ifPresent((s -> System.out.println(s.charAt(0))));
    }
}

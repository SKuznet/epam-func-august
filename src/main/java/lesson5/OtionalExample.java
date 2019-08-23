package lesson5;

import java.util.Optional;

public class OtionalExample {
    // NullPointerException!
    public static void main(String[] args) {
//        Optional<String> optional = Optional.ofNullable(null);
//        Optional<String> optional = Optional.of("something");

//        System.out.println(optional.isPresent());

        String example = null;

        if(example != null) {
            System.out.println("asdasd");
        } else {
            System.out.println("Example is null");
        }

//        Optional<String> optional = Optional.ofNullable(null);
//        Optional<String> optional = Optional.empty();
        Optional<String> optional = Optional.of("barsik");

        if (optional.isPresent()) {
            System.out.println("asdasd");
        } else {
            System.out.println("somenthing is null");
        }

        System.out.println(optional.orElse("Miss"));

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));

    }
}

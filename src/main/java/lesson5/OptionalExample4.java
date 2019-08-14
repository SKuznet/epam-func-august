package lesson5;

import java.util.Optional;

public class OptionalExample4 {
    public static void main(String[] args) {
        Optional<String> nonEmptyGender = Optional.of("female");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(nonEmptyGender.map(String::toUpperCase));
        System.out.println(nonEmptyGender.map(String::toUpperCase).get());

        System.out.println(emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
        System.out.println(nonEmptyOptionalGender);
        System.out.println(nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println(nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase).get()).get());

        System.out.println(nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

        Optional<String> gender = Optional.of("MALE");
        System.out.println(gender.orElse("<N/A>"));
        System.out.println(emptyGender.orElse("<N/A>"));

        System.out.println(gender.orElseGet(() ->"<N/A>"));
        System.out.println(emptyGender.orElseGet(()->"<N/A>"));
    }
}

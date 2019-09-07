package javaeighttest;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) throws Exception {

        Optional<Integer> optional = Optional.of(1);
        System.out.println(optional.get());

        Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional.orElse("2"));

        Optional<String> optionalS = Optional.of("hello world");
        System.out.println(optionalS.ofNullable("Hello!"));
        System.out.println(optionalS);
        optionalS.ifPresent(x-> System.out.println(x.toUpperCase()));
        System.out.println(getValue());

        Optional<String> os = Optional.of("Value");
        System.out.println(os.orElse("f" + "gf"));
        System.out.println(os.orElseGet(String::new));
    }

    private static Optional<String> getValue(){
        return Optional.ofNullable(null);
    }
}
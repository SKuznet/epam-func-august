package lesson5;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        //filter on optional
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("male")));
        System.out.println(gender.filter(g -> g.equals("male")));
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE")));

        if (gender.isPresent()) {
            System.out.println("Avaliable");
        } else {
            System.out.println("Not avaliable");
        }

        gender.ifPresent(g -> System.out.println("In gender optional, value is avaliable"));
        emptyGender.ifPresent(g -> System.out.println("In emptyGender optional, value is avaliable"));


    }
}

package lesson5;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        //filter onoptinal
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("male")));
        System.out.println(gender.filter(g -> g.equals("male")));
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("male")));

        if(gender.isPresent()){
            System.out.println("Value availibele");
        }else System.out.println("Value not available");

        gender.ifPresent(g -> System.out.println("In gender optinal, value is availible"));
        emptyGender.ifPresent(g -> System.out.println("In emptygender optinal, value is availible"));
    }
}

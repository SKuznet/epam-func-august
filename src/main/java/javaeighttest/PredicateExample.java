package javaeighttest;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> s.equals("Hello");
        System.out.println(stringPredicate.test("Hello"));

        Predicate<String> stringPredicate1 = String::isEmpty;
        System.out.println(stringPredicate.test("4"));

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.concat(s2).equals("2");
        System.out.println(biPredicate.test("", "2"));
    }
}

package lesson3.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = O -> O.isEmpty();
        System.out.println(predicate.test(""));
        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(biPredicate.test("Vasya", "Barsik"));
    }
}

package javaeighttest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalOperationsExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min(Comparator.comparingInt(String::length));
        min.ifPresent(System.out::println);

        Stream<Integer> s1 = Stream.iterate(1, n -> n + 1);
        Stream<String> s3 = Stream.of("1", "2", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s1.findAny().ifPresent(System.out::println); // 1
        s3.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println); // chimp

        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite2.anyMatch(pred)); // true

        Stream<String> s2 = Stream.of("Monkey", "Gorilla", "Bonobo");
        s2.forEach(System.out::print); // MonkeyGorillaBonobo
    }
}

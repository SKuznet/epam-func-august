package javaeighttest;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsExample2 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", String::concat);
        System.out.println(word1); // wolf

        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a*b));

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::print); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        StringBuilder word3 = stream4.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);
        System.out.println(word3);

        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream5.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]

        Stream<String> stream6 = Stream.of("w", "o", "l", "f");
        Set<String> set1 = stream6.collect(Collectors.toSet());
        System.out.println(set1); // [f, w, l, o]
    }
}

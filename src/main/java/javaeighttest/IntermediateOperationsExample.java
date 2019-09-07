package javaeighttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println); //filter

        System.out.println();

        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct().forEach(System.out::println); //distinct - removes duplicate values

        System.out.println();

        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
        s2.skip(5).limit(2).forEach(System.out::println); // 67

        System.out.println();

        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        s3.map(String::toUpperCase).forEach(System.out::println); // map - transform stream

        System.out.println();

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);

        System.out.println();

        Stream<String> s4 = Stream.of("brown-", "bear-");
        s4.sorted().forEach(System.out::println); // bear-brown-

        System.out.println();

        Stream<String> s5 = Stream.of("brown bear-", "grizzly-");
        s5.sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // grizzly-brown bear-

        System.out.println();

        Stream<String> s6 = Stream.of("black bear", "brown bear", "grizzly");
        long count = s6.filter(c -> c.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1

        System.out.println();

        Stream<String> s7 = Stream.of("black bear", "brown bear", "grizzly");
        s7.sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("Bar");
        list.add("BAR");
        list.stream().sorted().forEach(System.out::println);

        System.out.println();

        List<String> list1 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list1.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}

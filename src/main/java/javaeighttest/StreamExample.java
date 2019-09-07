package javaeighttest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.of();
        Stream<String> oneStream = Stream.of("1");
        Stream<Integer> arrayStream = Stream.of(1, 2, 3);

        List<String> stringList = Arrays.asList("1", "3", "f");
        Stream<String> stringStream = stringList.stream();
        Stream<String> stringParallelStream = stringList.parallelStream();

        Stream<Double> doubleStream = Stream.generate(Math::random);
        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1);

//        doubleStream.forEach(System.out::println); //infinite operation
//        integerStream.forEach(System.out::println); //too infinite

        System.out.println(stringStream.count());
        System.out.println(doubleStream.count());
    }
}

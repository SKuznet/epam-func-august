package javaeighttest;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamsExample {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream1.mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15

//        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
//        OptionalDouble min = doubles.min(); // runs infinitely
//        System.out.println(min);
    }
}

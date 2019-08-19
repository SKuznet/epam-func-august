package lesson6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HowToStream1 {
    public static void main(String[] args) throws NoSuchFieldException {
        List<Integer> list = Arrays.asList(1,2,3,5,8,13,21);

        list.stream();

        String[] array = {"Barsik", "Murzik", "Snwzok"};
        Stream<String> stringStreamFromArray = Arrays.stream(array);
/*
        try {
            Stream<String> streamFromFile  = Files.lines(Paths.get("File.txt"));
        } catch (IOException e) {
            throw new NoSuchFieldException();
        }

 */

        IntStream streamFromSrting = "123".chars();

        Stream.builder().add("aa1").add("aa2").add("aa3").build();

        list.parallelStream();
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);

        Stream<String> stringStream = Stream.generate(() ->  "a1");
        stringStream.forEach(System.out::println);
    }
}

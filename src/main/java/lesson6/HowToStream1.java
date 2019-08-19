package lesson6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HowToStream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 8, 13, 21);

        list.stream();

        Stream<String> values = Stream.of("Barsik", "Murzik", "Snezhok");

        String[] array = {"Barsik", "Murzik", "Snezhok"};
        Stream<String> stringStreamFromArray = Arrays.stream(array);

        try {
            Stream<String> streamFromFile = Files.lines(Paths.get("filex.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        IntStream streamFromString = "234".chars();
        Stream.builder().add("aa1").add("aa2").add("aa3").build();

        list.parallelStream();

        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);

    }
}

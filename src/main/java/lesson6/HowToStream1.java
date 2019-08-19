package lesson6;

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

//    try {
//      Stream<String> stramFromFile = Files.lines(Paths.get("file.txt"));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    IntStream streamFromString = "123".chars();

    Stream.builder().add("aa1").add("aa2").add("aa3").build();

    list.parallelStream();

    Stream<Integer> stream = Stream.iterate(1, n -> n + 1);

    Stream<String> stringStream = Stream.generate(()->"a1");
    stringStream.forEach(System.out::println);


  }
}

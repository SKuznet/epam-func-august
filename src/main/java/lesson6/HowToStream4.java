package lesson6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HowToStream4 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("1", "2", "3", "5", "8", "13", "21");
    System.out.println(list.stream().mapToInt(Integer::parseInt).sum());

    System.out.println(list.stream().mapToInt((s) -> Integer.parseInt(s)).average().getAsDouble());
    IntStream intStream = IntStream.range(1, 5);
    intStream.mapToObj(Long::valueOf).forEach(System.out::println);

    Stream<String> stringStream = list.stream();
    System.out.println(stringStream.isParallel());
    stringStream.parallel();
    stringStream.sequential();
  }

}

package lesson6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowToStream2 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Barsik", "Murzik", "Snezhok");
    Stream<String> stringStream = list.stream();

    System.out.println(stringStream.filter("ik"::contains).count());

    Stream<String> stream2 = Arrays.stream(new String[]{"Barsik", "Murzik"});
    System.out.println(stream2.skip(1).findFirst().orElse("Snezhok"));

    Stream<String> stream3 = Arrays.stream(new String[]{"Brsik", "Murzik", "Brsik", "Murzik"});
    System.out.println(stream3.distinct().collect(Collectors.toList()));

    Stream<String> stream4 = Arrays.stream(new String[]{"Brsik", "Murzik", "Snegok", "Riska"});
    System.out.println(stream4.map((s) -> s + " happe").collect(Collectors.toList()));

    Stream<String> stream5 = Arrays.stream(new String[]{"Brsik", "Murzik", "Snegok", "Riska"});
    System.out
        .println(stream5.map(String::toUpperCase).peek((e) -> System.out.println("," + e)).collect(
            Collectors.toList()));

    Stream<String> stream6 = Arrays.stream(new String[]{"Brsik", "Murzik", "Snegok", "Riska"});
    System.out.println(stream6.limit(2).collect(Collectors.toList()));

    Stream<String> stream7 = Arrays
        .stream(new String[]{"Brsik", "Murzik", "Snegok", "Riska", "Ara"});
    System.out.println(stream7.sorted().collect(Collectors.toList()));

    Stream<String> stream8 = Arrays.stream(new String[]{"1", "2", "3"});
    System.out.println(Arrays.toString(stream8.mapToInt(Integer::parseInt).toArray()));

    Stream<String> stream9 = Arrays.stream(new String[]{"Barsik,Murzik,Snegok"});
    System.out.println(Arrays
        .toString(stream9.flatMap((p) -> Arrays.stream(p.split(","))).toArray(String[]::new)));

  }

}

package lesson6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HowToStream3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Barsik", "Murzik", "Snezhok", "Ara", "Aro");
        List<String> list1 = Collections.singletonList("Barsik");

        System.out.println(list.stream().findFirst().orElse("1"));
        System.out.println(list.stream().findAny().orElse("1"));
        System.out.println(list.stream().filter(s -> s.contains("ik")).collect(Collectors.toList()));

        System.out.println(list.stream().filter("barsik"::equalsIgnoreCase).count());

        System.out.println(list.stream().anyMatch("barsik"::equalsIgnoreCase));
        System.out.println(list1.stream().allMatch("barsik"::equalsIgnoreCase));
        System.out.println(list.stream().noneMatch("riska"::equalsIgnoreCase));

        System.out.println(list.stream().min(String::compareTo));
        System.out.println(list.stream().max(String::compareTo));

        list.stream().forEach(System.out::println);
        list.stream().forEachOrdered(o -> System.out.println("Cat: " + o));

        System.out.println(list.stream().reduce(((s1, s2) -> s1 + "_" + s2)).orElse("1"));
    }
}

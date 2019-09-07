package java8test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hello");

        Consumer<Integer> integerConsumer = integer -> System.out.println(integer+6);
        integerConsumer.accept(7);

        BiConsumer<Integer, Integer> integerBiConsumer = (i1, i2) -> System.out.println(i1 + i2);
        integerBiConsumer.accept(2, 3);

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biConsumer = map::put;
        biConsumer.accept("One", 1);
        System.out.println(map);
        BiConsumer<String, Integer> biConsumer2 = (s, integer) -> map.put(s.toUpperCase(), integer+5);
        biConsumer2.accept("Hello", 5);
        System.out.println(map);

    }
}

package lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("Java");

        BiConsumer<String, Integer> biConsumer = (s, s2) -> System.out.println(s.charAt(s2));
        biConsumer.accept("Java", 3);

        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer1 = (i, s) -> map.put(i, s);
        biConsumer1.accept(12, "December");
        biConsumer1.accept(11, "November");
        System.out.println(map);
    }

}

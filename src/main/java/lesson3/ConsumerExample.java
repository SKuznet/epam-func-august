package lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        consumer.accept("Functional interface java 8");

        BiConsumer<String, String> biConsumer = ((s, s2) -> System.out.println(s.concat(s2)));

        biConsumer.accept("Cat", " Barsik");

        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer2 = ((i, s) -> map.put(i, s));
        biConsumer2.accept(1, "Barsik");
        biConsumer2.accept(2, "Murzik");
        System.out.println(map);
    }

}
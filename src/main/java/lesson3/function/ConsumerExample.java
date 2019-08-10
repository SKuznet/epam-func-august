package lesson3.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer2 = (i, s) -> map.put(i, s);
        biConsumer2.accept(1, "vasya");
        biConsumer2.accept(2, "murzik");
        System.out.println(map);
    }
}



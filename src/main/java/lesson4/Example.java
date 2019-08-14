package lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.out.println("example with L");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(integer -> System.out.println(integer));

        System.out.println("example with R");
        list.forEach(System.out::println);
    }
}

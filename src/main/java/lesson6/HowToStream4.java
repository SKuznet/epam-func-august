package lesson6;

import java.util.Arrays;
import java.util.List;

public class HowToStream4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "5", "8", "13");
        System.out.println(list.stream().mapToInt(Integer::parseInt).sum());
    }
}

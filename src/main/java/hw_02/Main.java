package hw_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        DocumentReader reader = new DocumentReader("src\\main\\resources\\example.csv");
        String text = reader.readFile();
        String[] lines = text.split("\n");
        List<String> list = Arrays.stream(lines)
                .filter(l->l.matches("^(http.*)|(www.*)"))
                .sorted()
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}

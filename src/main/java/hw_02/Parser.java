package hw_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    public static void main(String[] args) {
        Parser parser = new Parser();
        List list = parser.parse("src\\main\\resources\\example.csv");
        list.forEach(System.out::println);
    }

    public List<String> parse(String path) {
        DocumentReader reader = new DocumentReader(path);
        String text = reader.readFile();
        String[] lines = text.split("\n");
        List<String> list = Arrays.stream(lines)
                .filter(l -> l.matches("^(http.*)|(www.*)"))
                .sorted()
                .collect(Collectors.toList());
        return list;
    }
}

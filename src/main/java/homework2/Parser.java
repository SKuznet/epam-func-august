package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {
    private String fileName = "src\\main\\resources\\file.csv";
    private List<String> result;

    public Parser() {
    }

    public List<String> getList() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            result = stream.filter(s -> (s.startsWith("www") || s.startsWith("http"))).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

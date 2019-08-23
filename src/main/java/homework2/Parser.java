package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {
    public List<String> parseFile(String path) {
        Stream<String> dataStream = parseFileToStream(path);
        return dataStream
                .filter(a -> a.contains("www") || a.contains("http"))
                .sorted()
                .collect(Collectors.toList());
    }

    private Stream<String> parseFileToStream(String path) {
        try {
            return Files.lines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Can't read file.");
        }
    }
}

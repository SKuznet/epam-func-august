package homework.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {
    public List<String> getParserList(final String fileName) {
        Stream<String> stream = parseFileToStream(fileName);
        return stream.filter(s -> s.contains("www"))
                    .collect(Collectors.toList());
    }

    private Stream<String> parseFileToStream(final String fileName) {
        try {
            return Files.lines(getPathFile(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("file not found");
        }
    }

    private Path getPathFile(final String fileName) {
        return Paths.get(fileName);
    }
}

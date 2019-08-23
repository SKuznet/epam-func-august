package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class CSVParser {
    static List parse(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .filter(s -> s.contains("www.") || s.contains("http://"))
                .sorted()
                .collect(Collectors.toList());
    }
}

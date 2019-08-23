package homework.hw2;

import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CustomCSVParser {

    public static List<String> filterWebPages(String filePath) {
        return new PlainFileReader().getStreamFromResource(Paths.get(filePath))
                .filter((line) -> line.contains("www") || line.contains("http"))
                .sorted()
                .collect(Collectors.toList());
    }
}

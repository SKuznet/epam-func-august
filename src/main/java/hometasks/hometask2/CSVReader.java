package hometasks.hometask2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReader {

    public static List<String> findLinks(String path) {
        try {
            return Files.lines(Paths.get(path))
                    .filter((s) -> s.contains("www") || s.contains("http"))
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }
}

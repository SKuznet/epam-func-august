package hw3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvParser {

  public static List<String> getWebsitesFromCsvFile() throws IOException {
    Stream<String> streamFromFiles = Files.lines(Paths.get("src/main/resources/websites.csv"));
    List<String> result = streamFromFiles
        .filter(s -> s.contains("www") || s.contains("http"))
        .sorted((o1, o2) -> o1.compareToIgnoreCase(o2))
        .collect(Collectors.toList());

    return result;
  }
}

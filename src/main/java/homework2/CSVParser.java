package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Parses CSV file on given file path. You should parse only one-column csv-files.
 */
class CSVParser {
    /**
     * One-column CSV-file parser.
     * @param filePath Path of file to parse.
     * @return ArrayList of matched strings.
     * @throws IOException Throws IOException if file not found.
     */
    static List parse(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .filter(s -> s.contains("www.") || s.contains("http://"))
                .sorted()
                .collect(Collectors.toList());
    }
}

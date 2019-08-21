package homework2;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FileParser {

     private List<String> parseResult;

    public FileParser() {
    }

    public List<String> parseFile(String filePath) {
        parseResult = new ArrayList<>();
        try {
            Stream<String> stringStream = Files.lines(Paths.get(filePath));
            parseResult = stringStream.filter(s -> s.startsWith("www") || s.startsWith("http"))
                    .map(s -> s.split(",")[0])
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return parseResult;
    }
}

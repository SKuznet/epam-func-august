package homework.hw_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static String[] getSortedListFromCSV(Path path) {
        try {
            Stream<String> contentStream = Files.newBufferedReader(path).lines();
            List<String> contentList = contentStream.sorted().collect(Collectors.toList());
            return contentList.stream().toArray(String[]::new);
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

}
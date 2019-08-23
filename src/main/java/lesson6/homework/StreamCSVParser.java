package lesson6.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamCSVParser {

    private Stream<String> stringStream;

    public Stream<String> getStreamFromFilePath(String filePath) {
        Path path = Paths.get(filePath);

        try {
            stringStream = Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringStream;
    }

    public String[] getSortedArrayContainsWebElements(Stream<String> stringStream) {
        String[] array = stringStream.sorted().filter((s -> s.matches(Constants.WEB_ELEMENT))).toArray(String[]::new);
        Arrays.sort(array, Comparator.naturalOrder());

        return array;
    }
}
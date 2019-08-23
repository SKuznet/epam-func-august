package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * create CSV - parse from file to stream - contains "www" || "http" - добавить в коллекию, отсортировать и вернуть в
 * виде массива строк, покрыть тестом.
 */
public class StreamFromFile {
    public static void main(String[] args) {
        try {
            String path = "C:/Users/Николай/IdeaProjects/epam_func_august/src/main/resources/sample.csv";
            Stream<String> streamFromFile = Files.lines(Paths.get(path));
            System.out.println(Arrays.toString(streamFromFile
                    .filter((s) -> s.contains("http") || s.contains("www"))
                    .sorted()
                    .toArray(String[]::new)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

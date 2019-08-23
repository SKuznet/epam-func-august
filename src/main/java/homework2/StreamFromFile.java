package homework2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * create CSV - parse from file to stream - contains "www" || "http" - добавить в коллекию, отсортировать и вернуть в
 * виде массива строк, покрыть тестом.
 */
public class StreamFromFile {
    public String outputStream(String path) throws Exception {
        Stream<String> streamFromFile = Files.lines(Paths.get(path));
        return Arrays.toString(streamFromFile
                .filter((s) -> s.contains("http") || s.contains("www"))
                .sorted()
                .toArray(String[]::new));
    }

    public static void main(String[] args) {
        try {
            String path = "C:/Users/Николай/IdeaProjects/epam_func_august/src/main/resources/sample.csv";
            System.out.println(new StreamFromFile().outputStream(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

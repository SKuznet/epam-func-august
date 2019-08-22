package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class for work with Stream. It parses string from File to Stream and sorts
 * @author Iila Ugriumov
 */
public class StreamEx {

    public static void main(String[] args) {
        System.out.println(new StreamEx().parseFileFromFileToStream());
    }

    /**
     * Method parses string from file to stream and sorts it
     * @return List<String>
     */
    public List<String> parseFileFromFileToStream() {
        List<String> array = new ArrayList<>();
        Path path = Paths.get("/Users/ilyaugryumov 1/IdeaProjects/epam-func-august/src/main/resources/file.csv");
        try {
            Stream<String> stringStream = Files.newBufferedReader(path).lines();
            array = stringStream.filter(s -> s.contains("https")).sorted().collect(Collectors.toList());
        } catch(IOException e) {
            e.printStackTrace();
        }
        return array;
    }

}

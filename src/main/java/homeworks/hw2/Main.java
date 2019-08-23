package homeworks.hw2;

//## create CSV - parse from file to stream - contains "www" || "http" - добавить в коллекию, отсортировать и вернуть в
//виде массива строк, покрыть тестом.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        File file = new File("");
        String absolutePath = file.getAbsolutePath();
        Path path = Paths.get(absolutePath + "\\src\\main\\java\\homeworks\\hw2\\testFile");
        System.out.println(getLinks(path));
    }

    public static List getLinks(Path filePath) {
        List<String> result = new ArrayList<>();
        try (Stream<String> stream = Files.newBufferedReader(filePath).lines()) {
            List<String> data = stream.map(s -> Arrays.asList(s.split(" "))).flatMap(Collection::stream).filter(s -> (s.contains("www") || s.contains("http"))).collect(Collectors.toList());
            result.addAll(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

package homeworks.hw2;

//## create CSV - parse from file to stream - contains "www" || "http" - добавить в коллекию, отсортировать и вернуть в
//виде массива строк, покрыть тестом.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //doesn't work yet :(
    public static void main(String[] args) {
        Path path = Paths.get("homeworks/hw2/testFile");
        System.out.println(getLinks(path));
    }

    public static List getLinks(Path filePath) {
        List<String> result = new ArrayList<>();
        try (Stream<String> stream = Files.newBufferedReader(filePath).lines()) {
            List<String> data = stream.filter("www"::equals).collect(Collectors.toList());
            result.addAll(data);
            data = stream.filter("http"::equals).collect(Collectors.toList());
            result.addAll(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

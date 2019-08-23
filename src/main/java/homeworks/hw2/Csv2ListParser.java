package homeworks.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Csv2ListParser {

    public static List<String> parse(String path) {
        List stringList = new ArrayList();
        try {
            Stream<String> stringStream = Files.lines(Paths.get(path));
            stringList = stringStream.flatMap(s -> Stream.of(s.split(",")))
                    .filter(s -> s.startsWith("http")||s.startsWith("www"))
                    .collect(Collectors.toList());
            stringStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("There are no such file");
        }
        return stringList;
    }
}

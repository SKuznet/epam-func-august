package homeworks.homework1.homeworks.homework2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVParser {
    public  Set<String> parseCSV (String path){
        Set<String> result = new LinkedHashSet<>();
        try {
            Stream<String> stringStream = Files.lines(Paths.get(path));
            result = stringStream.flatMap(s -> Stream.of(s.split(","))).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

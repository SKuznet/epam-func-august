package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {
    public List<String> parseCsvFile(String fileName){
        List<String> result = new ArrayList<>();
        try {
            Stream<String> values = Files.lines(Paths.get(fileName));
            result = values.sorted().filter(u -> (u.startsWith("http://") || u.startsWith("www."))).collect(Collectors.toList());;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

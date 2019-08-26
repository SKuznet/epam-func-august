package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvParser {
    
    public static List<String> parseCsvFile(String path) {
        List<String> parsedFile = new ArrayList<>();
        
        try {
            parsedFile = Files.lines(Paths.get(path))
                    .filter(f -> f.startsWith("www") || f.startsWith("http"))
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return parsedFile;
    }
}

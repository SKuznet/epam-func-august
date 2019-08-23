package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\anton\\Desktop\\Java\\epam-func-august\\src\\main\\resources\\FileForStream.csv");

    }

    public boolean getListFromCsv(Path path) {
        List<String> stringStream = new ArrayList<>();
        try {
            stringStream = Files.lines(path).collect(Collectors.toList());
        } catch (IOException e) {
            return false;
        }
        Collections.sort(stringStream);
        System.out.println(stringStream);
        return true;
    }
}

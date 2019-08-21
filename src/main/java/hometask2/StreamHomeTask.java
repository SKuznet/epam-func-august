package hometask2;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class StreamHomeTask {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/container.csv");
        System.out.println(new StreamHomeTask().getFileContentAsSortedList(path));
    }

    public List getFileContentAsSortedList(Path filePath) {
        List<String> lines = new ArrayList<>();
        try (Stream<String> lineStream = Files.newBufferedReader(filePath).lines()) {
            lines = lineStream.sorted().collect(Collectors.toList());
        } catch (IOException e) {
            log.error("The file with path: {} is not found. Check your path or create a proper file.", filePath);
        }
        return lines;
    }
}

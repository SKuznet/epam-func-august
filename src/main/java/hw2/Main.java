package hw2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(
                Main.class.getClassLoader().getResource("Book.csv").getFile()
        );
        Stream<String> streamFromFile = Files.lines(file.toPath());
        System.out.println(Arrays.toString(streamFromFile.sorted().filter((s -> s.contains("http"))).toArray(String[]::new)));
    }
}

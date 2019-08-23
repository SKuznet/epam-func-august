package hw2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        File file = new File(
                Main.class.getClassLoader().getResource("Book.csv").getFile()
        );
        Stream<String> streamFromFile = null;
        try {
            streamFromFile = Files.lines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(streamFromFile.sorted().filter((s -> s.matches("^(www|http)([\\S\\s]*)$"))).toArray(String[]::new)));
    }
}

package HW2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        try {
            System.out.println(Arrays.toString(main.read("CSV/hw2.csv")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    String[] read(String path) throws IOException {
        File file = new File(path);
        String regEx= "^(www|http)([\\S]*)$";
        Stream<String> stream = Files.lines(file.toPath());
        return stream.sorted().filter((s -> s.matches(regEx))).toArray(String[]::new);
    }

}

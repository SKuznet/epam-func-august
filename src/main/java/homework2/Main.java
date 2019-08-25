package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static final String WEB_ELEMENT = "^(www|http)([\\S\\s]*)$";

    public static void main(String[] args) {

        try {

            List<String> containsWord = new ArrayList<>();
            Stream<String> csv = Files.lines(Paths.get(".\\src\\main\\resources\\csvfile.csv"));
            csv.forEach(s -> {
                String[] arr = s.split(";");
                Arrays.stream(arr).filter(s1 -> s1.contains("www") || s1.contains("http"))
                    .forEach(containsWord::add);
            });
            for (String s : containsWord) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

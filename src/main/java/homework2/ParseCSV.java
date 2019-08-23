package homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class ParseCSV implements logic of csv file
 */
public class ParseCSV {

    /**
     * Creating stream from file and afterwards put it into readStream method.
     * Finally, prints returned collection
     */
    public static void main(String[] args) {
        Stream<String> lines;
        try {
            lines = Files.lines(Paths.get("C:\\Users\\Fedor_Glushchenko\\git\\epam-func-august\\src\\main\\resources\\File.csv"));
            System.out.println(readStream(lines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Goes through stream, lets only elements starting with
     * "www" or "http" go to collection. Additionally, sorts
     * this collection
     *
     * @param lines Stream for operating
     * @return Sorted collection of elements starting with "www" and "http"
     */
    static List<String> readStream(Stream<String> lines) {
        return lines
                .filter(o -> o.indexOf("www") == 0 || o.indexOf("http") == 0).sorted().collect(Collectors.toList());
    }
}

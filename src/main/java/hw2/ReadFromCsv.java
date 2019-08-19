package hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFromCsv {
    public static void main(String[] args) {
        String filename = System.getProperties().getProperty("user.dir") + "/src/main/resources/websites.csv";
        try {
            read(filename);
        } catch (IOException e) {
            System.err.println("Cannot parse cause " + e);
        }
    }

    /**
     * Read all lines from selected file, separate lines by comma,
     * filter by containing 'http' or 'www' substring
     * print all matches by first column (exclude labels)
     *
     * @param filename full path to CSV file
     * @throws IOException
     */
    static void read(String filename) throws IOException {
        Stream<String> streamFromFile = Files.lines(Paths.get(filename));
        streamFromFile
                .skip(1)
                .map(l -> l.split(","))
                .filter(l -> String.valueOf(l[0]).contains("http") || String.valueOf(l[0]).contains("www"))
                .forEach(x -> System.out.println(x[0]));
        streamFromFile.close();
    }
}
package hw2;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ReadFromCsvTest {

    @Test(expected = NoSuchFileException.class)
    public void readIncorrect() throws IOException {
        String path = "/non_existed_path";
        ReadFromCsv.read(path);
    }

    @Test
    public void readCorrect() throws IOException {
        String filename = System.getProperties().getProperty("user.dir") + "/src/main/resources/websites.csv";
        Stream<String> streamFromFile = Files.lines(Paths.get(filename));
        int rows = (int) streamFromFile
                .skip(1)
                .map(l -> l.split(","))
                .filter(l -> String.valueOf(l[0]).contains("http") || String.valueOf(l[0]).contains("www"))
                .count();
        streamFromFile.close();
        assertEquals(6, rows);
    }
}

package hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamTest {
    private File file;
    private static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        file = new File(
                Main.class.getClassLoader().getResource("Book.csv").getFile()
        );
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void streamResultTest(){
        Stream<String> streamFromFile = null;
        try {
            streamFromFile = Files.lines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(streamFromFile.sorted().filter((s -> s.contains("http"))).toArray(String[]::new)));
        assertEquals("[https://aaa, https://web.whatsapp.com/, https://yandex.ru/]\r\n", outContent.toString());
    }
}

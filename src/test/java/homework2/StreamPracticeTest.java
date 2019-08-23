package homework2;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class StreamPracticeTest {
    private final StreamPractice streamPractice = new StreamPractice();
    private final Path path = Paths.get("C:\\Users\\anton\\Desktop\\Java\\epam-func-august\\src\\main\\resources\\FileForStream.csv");

    @Test
    public void testWithCorrectPath() {
        assertTrue(streamPractice.getListFromCsv(path));
    }

    @Test
    public void testWithIncorrectPath() {
        assertFalse(streamPractice.getListFromCsv(Paths.get("")));
    }
}

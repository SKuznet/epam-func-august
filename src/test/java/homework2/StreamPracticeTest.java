package homework2;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class StreamPracticeTest {
    private final StreamPractice streamPractice = new StreamPractice();
    private final Path path = Paths.get("src\\main\\resources\\FileForStream.csv");

    @Test
    public void testWithCorrectPath() {
        assertFalse(streamPractice.getListFromCsv(path).isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIncorrectPath() {
        streamPractice.getListFromCsv(Paths.get(""));
    }
}

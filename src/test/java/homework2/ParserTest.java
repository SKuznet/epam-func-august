package homework2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {
    public static final String FILE_NAME = "src/main/resources/testInput.csv";
    Parser parser;

    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void parseFileTest() {
        List<String> expected = new ArrayList<>();
        expected.add("http://google.ru");
        expected.add("http://yandex.ru");
        expected.add("www.hackerrank.com");
        expected.add("www.spring.io");
        List<String> result = parser.parseFile(FILE_NAME);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test (expected = IllegalArgumentException.class)
    public void parseFileTestWithException() {
        parser.parseFile("noFile");
        fail();
    }
}
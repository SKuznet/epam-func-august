package homework.task2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {
    private static final String PATH_TO_FILE = "/Users/anton/IdeaProjects/epam-func-august/src/main/resources/list.csv";
    private Parser parser;
    private List<String> list = new ArrayList<>();

    @Before
    public void setUpParse() {
        parser = new Parser();
        list.add("https://www.reddit.com");
        list.add("https://www.google.ru");
        list.add("https://www.youtube.com");
        list.add("https://www.epam.com");
    }

    @Test
    public void testGetParserList() {
        List<String> listFromParser = parser.getParserList(PATH_TO_FILE);
        assertArrayEquals(list.toArray(), listFromParser.toArray());
    }
    @Test (expected = IllegalArgumentException.class)
    public void testGetParserListWithException() {
        parser.getParserList("not file");
    }
}
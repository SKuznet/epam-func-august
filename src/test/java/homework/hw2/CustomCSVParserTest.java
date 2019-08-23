package homework.hw2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomCSVParserTest {

    private final String fileWithLinks = "src/main/resources/watchers_with_links.csv";
    private final String fileNoLinks = "src/main/resources/watchers_no_links.csv";
    private final String fileEmpty = "src/main/resources/watchers_empty.csv";
    private List<String> result;
    private List<String> expected;

    @Test
    public void testWithFileWithLinks() {
        result = CustomCSVParser.filterWebPages(fileWithLinks);
        expected = Arrays.asList("SDFGHJ45678ghj,ghjkl,http", "asd,http,4567", "with,www,extra,info,111", "www,some,text,here");
        assertEquals(expected, result);
    }

    @Test
    public void testWithFileNoLinks() {
        result = CustomCSVParser.filterWebPages(fileNoLinks);
        expected = Collections.emptyList();
        assertEquals(expected, result);
    }

    @Test
    public void testWithFileEmpty() {
        result = CustomCSVParser.filterWebPages(fileEmpty);
        expected = Collections.emptyList();
        assertEquals(expected, result);
    }
}

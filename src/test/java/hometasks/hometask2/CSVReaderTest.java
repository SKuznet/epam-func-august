package hometasks.hometask2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CSVReaderTest {

    private final String TEST_STRING_EMPTY_FILE_PATH = "src\\test\\resources\\testStringsEmpty.csv";
    private final String TEST_STRING_WITH_LINKS_PATH = "src\\test\\resources\\testStringsWithLinks.csv";
    private final String TEST_STRING_WITHOUT_LINKS_PATH = "src\\test\\resources\\testStringsWithoutLinks.csv";
    private final String TEST_STRING_NON_EXISTING_PATH = "ui9wgsdgjyt98234nytio2h439ghfkhgo34rf83";
    private List<String> result;
    private List<String> expected;

    @Test
    public void testFindLinksEmptyFile() {
        result = CSVReader.findLinks(TEST_STRING_EMPTY_FILE_PATH);
        expected = Collections.emptyList();
        assertEquals(expected, result);
    }

    @Test
    public void testFindLinksFileWithLinks() {
        result = CSVReader.findLinks(TEST_STRING_WITH_LINKS_PATH);
        expected = Arrays.asList("http://ya.ru", "https://github.com/SKuznet/epam-func-august", "www.github.com",
                "www.google.com");
        assertEquals(expected, result);
    }

    @Test
    public void testFindLinksFileWithoutLinks() {
        result = CSVReader.findLinks(TEST_STRING_WITHOUT_LINKS_PATH);
        expected = Collections.emptyList();
        assertEquals(expected, result);
    }

    @Test
    public void testFindLinksIncorrectPath() {
        result = CSVReader.findLinks(TEST_STRING_NON_EXISTING_PATH);
        expected = Collections.emptyList();
        assertEquals(expected, result);
    }
}

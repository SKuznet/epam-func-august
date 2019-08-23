package homework2;


import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CSVParserTest {
    private String noResultsFilePath = System.getProperty("user.dir") + "/src/test/resources/noresults.csv";
    private String twoResultsFilePath = System.getProperty("user.dir") + "/src/test/resources/2results.csv";
    private String threeResultsFilePath = System.getProperty("user.dir") + "/src/test/resources/3results.csv";

    @Test(expected = IOException.class)
    public void testParseFileNotFound() throws IOException {
        CSVParser.parse("notExistingFile.txt");
    }

    @Test
    public void testParseNoResults() throws IOException {
        List a = CSVParser.parse(noResultsFilePath);
        assertTrue(CSVParser.parse(noResultsFilePath).isEmpty());
    }

    @Test
    public void testParseTwoResults() throws IOException {
        assertEquals(2, CSVParser.parse(twoResultsFilePath).size());
    }

    @Test
    public void testParseThreeResults() throws IOException {
        assertEquals(3, CSVParser.parse(threeResultsFilePath).size());
    }
}

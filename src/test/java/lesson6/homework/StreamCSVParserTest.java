package lesson6.homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StreamCSVParserTest {

    private StreamCSVParser streamCSVParser;
    private String filePath = "src/main/resources/test_sites.csv";
    private String[] expected = {"http.epam", "http.sun", "www.aaaa", "www.bbbb"};

    @Before
    public void init(){
        streamCSVParser = new StreamCSVParser();
    }

    @Test
    public void getStreamFromFilePathTest(){
        Assert.assertNotNull(streamCSVParser.getStreamFromFilePath(filePath));
    }


    @Test
    public void getSortedStringArrayByStreamContainsWebElementsTest(){
        String[] actual = streamCSVParser.getSortedArrayContainsWebElements(streamCSVParser.getStreamFromFilePath(filePath));
        Assert.assertArrayEquals(expected, actual);
    }
}

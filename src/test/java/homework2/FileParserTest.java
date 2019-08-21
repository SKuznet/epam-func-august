package homework2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FileParserTest {

    private final static String FILE_PATH = "src\\main\\resources\\websites.csv";

    private FileParser fileParser;

    @Before
    public void init(){
        fileParser = new FileParser();
    }

    @Test
    public void testParseFile(){
        List<String> parseResult = fileParser.parseFile(FILE_PATH);

        Assert.assertTrue(parseResult.contains("www.vk.com"));
        Assert.assertTrue(parseResult.contains("www.facebook.com"));
        Assert.assertTrue(parseResult.contains("www.bing.com"));
        Assert.assertTrue(parseResult.contains("www.yandex.ru"));
        Assert.assertTrue(parseResult.contains("http://rambler.ru"));
        Assert.assertTrue(parseResult.contains("https://youtube.com"));

        Assert.assertFalse(parseResult.contains("htt://google.com"));
        Assert.assertFalse(parseResult.contains("wwvw.mail.ru"));
        Assert.assertFalse(parseResult.contains("ww.ok.ru"));

    }
}

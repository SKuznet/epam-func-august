package homework2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ParserTest {
    Parser parser;

    @Before
    public void init() {
        parser = new Parser();
        Assert.assertNotNull(parser);
    }

    @Test
    public void testGetName() {
        List<String> str = parser.getList();
        Assert.assertEquals(str.get(0), "www.dfsd.sdf");
        Assert.assertEquals(str.get(1), "http.sdfsdf.sdfsdf");
        Assert.assertFalse(str.contains("httsss"));
        Assert.assertFalse(str.contains("ww.dfgdfg."));
        Assert.assertFalse(str.contains("/werwerw/www/www/"));
        Assert.assertFalse(str.contains(".wefew.http..."));
        Assert.assertTrue(str.contains("www.sdf.sdf.sdf."));
    }
}

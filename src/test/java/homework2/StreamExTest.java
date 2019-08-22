package homework2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StreamExTest {
    private StreamEx streamEx;
    private List<String> array;

    @Before
    public void setUp(){
        streamEx = new StreamEx();
        array = new ArrayList<>();
        array.add ("https://e.mail.ru/messages/inbox/");
        array.add ("https://github.com/ilya-ugr");
        array.add ("https://jira.epam.com/");
        array.add ("https://outlook.office.com/");
        array.add ("https://www.baeldung.com/spring-value-annotation");
        array.add ("https://www.youtube.com/watch");
    }

    @Test
    public void testParseFileFromFileToStream() {
        Assert.assertNotNull(streamEx.parseFileFromFileToStream());
        Assert.assertEquals( array, streamEx.parseFileFromFileToStream());
    }
}

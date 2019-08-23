package homework2;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

public class StreamFromFileTest {
    private StreamFromFile streamFromFile;

    @Before
    public void init() {
        streamFromFile = new StreamFromFile();
    }

    @Test(expected = IOException.class)
    public void testCreateCat() throws Exception {
        String path = "wewewe.txt";
        streamFromFile.outputStream(path);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateCatNull() throws Exception {
        String path = null;
        streamFromFile.outputStream(path);
    }
}

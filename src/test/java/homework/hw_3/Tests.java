package homework.hw_3;

import org.junit.Test;

import java.nio.file.Paths;

import static homework.hw_3.Main.getSortedListFromCSV;
import static org.junit.Assert.assertArrayEquals;

public class Tests {

    @Test
    public void testWithWrongPath() {
        assertArrayEquals(new String[]{"File not found!"}, getSortedListFromCSV(Paths.get("/qwerty")));
    }

    @Test
    public void testWithCorrectPath() {
        assertArrayEquals(new String[]{"http://site1.com", "http://site4.com", "www.site2.com", "www.site3.com"}, getSortedListFromCSV(Paths.get("./src/main/resources/repo.csv")));
    }
}

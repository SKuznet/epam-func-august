package homeworks.hw2;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Csv2ListParserTest {
    String testPath;

    @Before
    public void setUp() {
        testPath = "src/test/resources/test.csv";
    }

    @Test
    public void parseTest(){
        List<String> testList = Csv2ListParser.parse(testPath);

        assertTrue(testList.size()==3);
        assertTrue((testList.get((int)(Math.random()*testList.size())).startsWith("www")||
                testList.get((int)(Math.random()*testList.size())).startsWith("http")));
    }


}
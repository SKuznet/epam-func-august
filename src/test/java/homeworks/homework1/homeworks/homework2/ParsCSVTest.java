package homeworks.homework1.homeworks.homework2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class ParsCSVTest {
    Set<String> testSet;

    @Before
    public void init() {
        testSet = new LinkedHashSet<>();
        testSet.add("text1");
        testSet.add("text2");
        testSet.add("text3");
        testSet.add("text4");
        testSet.add("text5");
        testSet.add("text6");
    }

    @Test
    public void ParsCSVTest() {

        String path = "/Users/zstudent/Desktop/epam-func-august/src/main/resources/test.csv";
        CSVParser parser = new CSVParser();
        Assert.assertEquals(testSet, parser.parseCSV(path));
    }

}
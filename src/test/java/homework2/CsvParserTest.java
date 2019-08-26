package homework2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CsvParserTest {
    
    String pathToTestCsvFile;
    List<String> correctData = new ArrayList<>();
    
    @Before
    public void init() {
        try {
            pathToTestCsvFile = "C:\\Users\\Zstudent\\IdeaProjects\\Java8\\epam-func-august\\src\\main\\resources\\homework2\\testCsv.csv";
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        correctData.add("http://www.yandex.ru");
        correctData.add("www.github.com");
        correctData.add("www.google.com");
    }
    
    @Test
    public void testCsvFile() {
        Assert.assertEquals(correctData, CsvParser.parseCsvFile(pathToTestCsvFile));
        Assert.assertNotEquals(null, CsvParser.parseCsvFile(pathToTestCsvFile));
    }
}

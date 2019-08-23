package hw_02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParserTest {
    Parser parser;
    @Before
    public void initialize(){
        parser   = new Parser();
    }

    @Test
    public void parseTest(){
        List<String> expectedList = new ArrayList<>();
        expectedList.add("https://github.com/SKuznet/epam-func-august");
        expectedList.add("www.google.com");
        List<String> actualList = parser.parse("src\\main\\resources\\example.csv");
        Assert.assertEquals(expectedList,actualList);
    }
}

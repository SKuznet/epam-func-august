package lesson6.homework;

import org.junit.Assert;
import org.junit.Test;

public class ConstantsTest {

    private String wwwStringTest = "www.something";
    private String httpStringTest = "http.something";
    private String stringTest = "something";

    @Test
    public void webElementConstantTest(){
        Assert.assertTrue(wwwStringTest.matches("^(www|http)([\\S\\s]*)$"));
        Assert.assertTrue(httpStringTest.matches("^(www|http)([\\S\\s]*)$"));
        Assert.assertFalse(stringTest.matches("^(www|http)([\\S\\s]*)$"));
    }
}

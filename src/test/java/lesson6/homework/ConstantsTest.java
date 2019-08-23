package lesson6.homework;

import org.junit.Assert;
import org.junit.Test;

public class ConstantsTest {

    private String wwwStringTest = "www.something";
    private String httpStringTest = "http.something";
    private String stringTest = "something";

    @Test
    public void webElementConstantTest(){
        Assert.assertTrue(wwwStringTest.matches(Constants.WEB_ELEMENT));
        Assert.assertTrue(httpStringTest.matches(Constants.WEB_ELEMENT));
        Assert.assertFalse(stringTest.matches(Constants.WEB_ELEMENT));
    }
}

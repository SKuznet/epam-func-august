package HW2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {
    private Main main;
    @Before
    public void init() {
        main = new Main();
    }
    @Test
    public void testRead() throws IOException{
        Assert.assertEquals("[http://aaaa.com, https://github.com/, www.epam.com, www.epam.ru, " +
                "www.qwerty, www.xyz.ru]", Arrays.toString(main.read("CSV/hw2.csv")));
    }
}
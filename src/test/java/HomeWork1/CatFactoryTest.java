package java.HomeWork1;

import HomeWork1.Cat;
import HomeWork1.CatFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatFactoryTest {
    @Test
    public void getCatTest() {
        Cat cat = CatFactory.getCat("Barsik");
        assertEquals("Barsik", cat.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getCatTestException() {
        CatFactory.getCat(null);
    }
}

package homework1;

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
package homework1.cats;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatFactoryTest {
    @Test
    public void testGetCat() {
        assertEquals("Barsik", CatFactory.getCat("Barsik").getName());
    }
}

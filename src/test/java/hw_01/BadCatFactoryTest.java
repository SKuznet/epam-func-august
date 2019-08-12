package hw_01;

import hw_01.impl.BadCat;
import hw_01.impl.BadCatFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BadCatFactoryTest {
    private static Factory factory;

    @BeforeClass
    public static void init() {
        factory = new BadCatFactory();
    }

    @Test
    public void testGetCat() {
        Cat cat = new BadCat("TestRyska");
        Assert.assertEquals(cat, factory.getCat("TestRyska"));
        Assert.assertNotEquals(cat, factory.getCat("TestMurka"));
    }

    @Test(expected = NullPointerException.class)
    public void testGetCatWithEsception() {
        factory.getCat(null);
    }
}

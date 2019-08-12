package hw_01;

import hw_01.impl.GoodCat;
import hw_01.impl.GoodCatFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GoodCatFactoryTest {
    private static Factory factory;

    @BeforeClass
    public static void init() {
        factory = new GoodCatFactory();
    }

    @Test
    public void testGetCat() {
        Cat cat = new GoodCat("TestVaska");
        Assert.assertEquals(cat, factory.getCat("TestVaska"));
        Assert.assertNotEquals(cat, factory.getCat("TestMurka"));
    }

    @Test(expected = NullPointerException.class)
    public void testGetCatWithEsception() {
        factory.getCat(null);
    }
}

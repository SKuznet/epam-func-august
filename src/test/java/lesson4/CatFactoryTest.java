package lesson4;

import lesson1.CatLogic;
import lesson4.homework4.CatFactory;
import lesson4.homework4.CatInst;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatFactoryTest {
    private CatFactory catFactory;
    private CatInst cat;
    private String name;
    private String fakeName;

    @Before
    public void init() {
        catFactory = CatInst::new;
        name = "Barsik";
        fakeName = "Barsuk";
        cat = catFactory.createCat(name);
    }

    @Test
    public void testName() {
        Assert.assertTrue(cat.getName() == name);
    }

    @Test
    public void testFakeName() {
        Assert.assertFalse(cat.getName() == fakeName);
    }

}

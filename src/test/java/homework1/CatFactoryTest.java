package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatFactoryTest {


    private CatFactory catFactory;
    private Cat catTest1;
    private Cat catTest2;
    private Cat cat1;
    private Cat cat2;

    @Before
    public void init() {
        catFactory = new CatFactory();
    }

    @Test
    public void testCreateCat() {
        cat1 = CatFactory.createCat("Barsik", "brown", 3, "pork");
        cat2 = CatFactory.createCat("Kotya");

        catTest1 = new Cat("Barsik", "brown", 3, "pork");
        catTest2 = new Cat("Kotya", "gray-brown-raspberry", 1, "any food");

        Assert.assertNotNull(cat1);
        Assert.assertNotNull(cat2);

        Assert.assertEquals(catTest1, cat1);
        Assert.assertEquals(catTest2, cat2);
    }
}
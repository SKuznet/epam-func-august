package homework1;

import org.junit.*;

public class CatFactoryTest {
    private CatFactory catFactory;
    private Cat cat1;
    private Cat cat2;
    private Cat cat3;

    @Before
    public void init() {
        catFactory = new CatFactory();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCreateCat() {
        cat1 = catFactory.createCat("Abyssinian", "Alex", true, false);
        cat2 = catFactory.createCat("Sphynx", "Riska", true, false);
        Assert.assertNotNull(cat1);
        Assert.assertNotNull(cat2);

        cat3 = catFactory.createCat("413543", "werwer", true, false);
    }
}

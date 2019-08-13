package homework1;

import lesson1.CatLogic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatFactoryTest {

    CatFactory catFactory;
    
    @Before
    public void init() {
        catFactory = new CatFactory();
    }

    @Test
    public void testGetCatCount() {
        Assert.assertEquals(new Barsik("Barsik1", false, false), catFactory.createCat("Barsik"));
        Assert.assertEquals(new Murzik("Murzik1", false, false), catFactory.createCat("Murzik"));
        Assert.assertNotEquals(new Barsik("Barsik1", false, false), catFactory.createCat("Murzik"));
        Assert.assertNotEquals(new Murzik("Murzik1", false, false), catFactory.createCat("Barsik"));
    }
}

package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {
    Cat cat = new Cat();

    @Before
    public void init() {
        cat = new Cat();
    }

    @Test
    public void testGetName() {
        cat.setName("CAT");
        Assert.assertEquals(cat.getName(), "CAT");
    }
}

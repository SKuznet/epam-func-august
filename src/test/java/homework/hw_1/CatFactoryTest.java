package homework.hw_1;

import homework.hw_1.cats.Barsik;
import homework.hw_1.cats.Mursik;
import org.junit.Assert;
import org.junit.Test;

import static homework.hw_1.CatFactory.createCat;

public class CatFactoryTest {
    @Test
    public void testCreateCat() {
        Assert.assertEquals(createCat("Barsik"), new Barsik("Barsik", 1,true,true));
        Assert.assertEquals(createCat("Mursik"), new Mursik("Mursik", 2,false,false));
    }
    @Test(expected = IllegalArgumentException.class)
    public void illegalTestCreateCat() {
        createCat("");
    }

}

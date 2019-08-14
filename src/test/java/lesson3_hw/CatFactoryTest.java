package lesson3_hw;

import lesson3.hw.cats.Barsik;
import lesson3.hw.cats.Cat;
import lesson3.hw.cats.Mursik;
import org.junit.Assert;
import org.junit.Test;

import static lesson3.hw.CatFactory.createCat;

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

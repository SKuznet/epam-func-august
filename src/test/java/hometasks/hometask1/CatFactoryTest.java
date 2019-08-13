package hometasks.hometask1;

import hometasks.hometask1.Cats.AbyssinianCat;
import hometasks.hometask1.Cats.AegeanCat;
import org.junit.Assert;
import org.junit.Test;

public class CatFactoryTest {

    @Test
    public void testCreateCat() {
        Cat cat = CatFactory.createCat("Alpha", 3, "abyssinian");
        Assert.assertTrue(cat instanceof AbyssinianCat);

        cat = CatFactory.createCat("Betta", 2, "aegean");
        Assert.assertTrue(cat instanceof AegeanCat);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCatIllegalArgument() {
        Cat cat = CatFactory.createCat("Alpha", 3, "asdasfr132rt");
    }

}

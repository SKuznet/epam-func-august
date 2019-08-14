package TestHw1;

import hw1.*;
import hw1.CatFactory;
import hw1.Cats.Barsik;
import hw1.Cats.Murzik;
import hw1.Cats.NoNameCat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatFactoryTest {
    Cat catBarsik;
    Cat catMurzik;
    Cat catNoName;

    @Before
    public void catInit() {
        catBarsik = CatFactory.getCat("Barsik");
        catMurzik = CatFactory.getCat("Murzik");
        catNoName = CatFactory.getCat("noName");
    }

    @Test
    public void testCatFactory() {
        Assert.assertEquals(catBarsik, new Barsik());
        Assert.assertEquals(catMurzik, new Murzik());
        Assert.assertEquals(catNoName, new NoNameCat());
    }

    @Test
    public void testCats() {
        Assert.assertEquals("Barsik", catBarsik.name());
        Assert.assertEquals("Murzik", catMurzik.name());
        Assert.assertEquals("NoNameCat", catNoName.name());
    }
}

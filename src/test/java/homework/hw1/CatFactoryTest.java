package homework.hw1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatFactoryTest {

    Cat catWithGivenData;
    Cat catWithDfaultData;
    CatFactory catFactory;

    @Before
    public void init() {
        catFactory = new CatFactory();
        catWithGivenData = new Cat("Kitty", 10, CatType.DOMESTIC, true);
        catWithDfaultData = new Cat();
    }

    @Test
    public void testAnimalFactories() {
        Assert.assertEquals(catWithGivenData, catFactory.createRepresentative("Kitty", 10, CatType.DOMESTIC, true));
        Assert.assertEquals(catWithDfaultData, catFactory.createRepresentative());
    }
}

package HW1;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

public class BritishCatFactoryTest {
    @Test
    public void testcreate(){
        CatFactory britishCatFactory = new BritishCatFactory();
        Cat british_cat = britishCatFactory.create();
        Assert.assertThat(british_cat, instanceOf(BritishCat.class));
    }
}

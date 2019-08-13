package HW1;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

public class SiamCatFactoryTest {
    @Test
    public void testcreate(){
        CatFactory siamCatFactory = new SiamCatFactory();
        Cat british_cat = siamCatFactory.create();
        Assert.assertThat(british_cat, instanceOf(SiamCat.class));
    }
}

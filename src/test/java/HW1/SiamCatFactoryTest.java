package HW1;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class SiamCatFactoryTest {

    @Test
    public void testCreate(){
        CatFactory siamCatFactory = new SiamCatFactory();
        Cat british_cat = siamCatFactory.create();
        Assert.assertThat(british_cat, instanceOf(SiamCat.class));
    }
}
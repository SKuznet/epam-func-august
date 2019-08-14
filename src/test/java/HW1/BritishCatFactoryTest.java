package HW1;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class BritishCatFactoryTest {

    @Test
    public void testCreate(){
        CatFactory britishCatFactory = new BritishCatFactory();
        Cat british_cat = britishCatFactory.create();
        Assert.assertThat(british_cat, instanceOf(BritishCat.class));
    }
}
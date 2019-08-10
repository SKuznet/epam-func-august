package lesson1;

import org.junit.Assert;
import org.junit.Test;

public class CatUtilTest {

    @Test
    public void testCheckCatName() {
        String wrongCatName = "Sharik";
        CatUtil catUtil = new CatUtil();
        Assert.assertFalse(catUtil.checkCatName(wrongCatName));
    }
}

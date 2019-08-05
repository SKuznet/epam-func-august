package lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatLogicTest {
    private CatLogic catLogic;
    private String catName1;
    private String catWoman1;
    private String catName2;
    private String catWoman2;

    @Before
    public void iit(){
        catLogic = new CatLogic();
        catName1 = "Barsik";
        catName2 = "Murzik";
        catWoman1 = "Riska";
    }

    @Test
    public void testGetCatCount(){
        Assert.assertEquals(2,catLogic.getCatCount(catName1,catWoman1));
        Assert.assertNotEquals(2,catLogic.getCatCount(catName1,null));
        //Assert.assertNotEquals(2,catLogic.getCatCount(catName2,catWoman1));
    }
}

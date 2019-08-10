package lesson1;

import org.junit.*;

import java.util.concurrent.TimeUnit;

// same name that have the current class + Test
public class CatLogicTest {
    private CatLogic catLogic;
    private String catName1;
    private String catWomanName1;
    private String catName2;

    @Before
    public void init() {
        catLogic = new CatLogic();
        catName1 = "Barsik";
        catName2 = "Murzik";
        catWomanName1 = "Riska";
    }

    @Test
    public void testGetCatCount() {
       Assert.assertEquals(2, catLogic.getCatCount(catName1, catWomanName1));
       Assert.assertNotEquals(2, catLogic.getCatCount(catName1, null));
       Assert.assertNotEquals(2, catLogic.getCatCount(catName2, catWomanName1));

       Assert.assertEquals(1, catLogic.getCatCount(catName1, null));
       Assert.assertEquals(1, catLogic.getCatCount(null, catWomanName1));

       Assert.assertEquals(10, catLogic.getCatCount(catName2, catWomanName1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCatCountWithException() {
        catLogic.getCatCount(null, null);
    }

}

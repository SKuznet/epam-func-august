package homework1;

import org.junit.*;

public class CatFuncTest {
    private CatFunc catFunc1;
    private CatFunc catFunc2;

    @Before
    public void init() {
        catFunc1 = CatFunc.CatFactory.createCat("TestCat1", 404, true);
        catFunc2 = CatFunc.CatFactory.createCat("TestCat2", 666, false);
    }

    @Test
    public void testGetTwoNames() {
        String composedName = catFunc1.getName() + " & " + catFunc2.getName();
        String badComposedName = catFunc1.getName() + "badName";

        Assert.assertEquals(composedName, catFunc1.getTwoNames(catFunc2));
        Assert.assertNotEquals(badComposedName, catFunc1.getTwoNames(catFunc1));
    }

    @Test
    public void testUpperCaseNameCat() {
        String upperCaseName1 = catFunc1.getName().toUpperCase();
        String upperCaseName2 = catFunc2.getName();

        Assert.assertEquals(upperCaseName1, catFunc1.upperCaseNameCat().getName());
        Assert.assertNotEquals(upperCaseName2, catFunc2.upperCaseNameCat().getName());
    }

    @Test
    public void testMotherCat() {
        int totalWeight = catFunc1.getWeight() + catFunc2.getWeight() + 50;

        Assert.assertEquals(totalWeight, catFunc1.motherCat(catFunc2).getWeight());
    }

}

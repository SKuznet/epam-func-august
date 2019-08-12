package homeworks.homework1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatFactoryTest {

    @Test
    public void BlackCatFactoryTest(){
        CatFactory blackCatFactory = new BlackCatFactory();
        Assert.assertEquals("Black", blackCatFactory.createCat().getColor());
        Assert.assertEquals("White", blackCatFactory.createCat().setColor("White").getColor());
    }

    @Test
    public void RedCatFactoryTest(){
        CatFactory redCatFactory = new RedCatFactory();
        Assert.assertEquals("Red", redCatFactory.createCat().getColor());
        Assert.assertEquals("White", redCatFactory.createCat().setColor("White").getColor());
    }

}
package lesson3.homework;

import lesson3.homework.cats.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    Cat murzik;
    Cat barsik;

    @Before
    public void createCat(){
        murzik = CatFactory.createCat("Murzik");
        barsik = CatFactory.createCat("Barsik");
    }

    @Test
    public void testPlay(){
        murzik.play();
        Assert.assertTrue(murzik.isPlaying());
    }

    @Test
    public void testPlayWithAnotherCat(){
        murzik.play(barsik);
        Assert.assertTrue(murzik.isPlayingWithAnotherCat());
    }

    @Test
    public void testEquals(){
        Assert.assertFalse(murzik.equals(barsik));
    }
}

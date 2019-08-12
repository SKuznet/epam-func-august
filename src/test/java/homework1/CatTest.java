package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CatTest {
    private Random rnd;
    private Cat cat;

    @Before
    public void setUp() {
        rnd = new Random ();
        cat = new Cat ( "Barsik", 5, "black" );
    }

    @Test
    public void testDoNametoUpperCase() {
        Assert.assertEquals ( Cat.class, new Cat ( "Barsik", 5, "black" ).getClass () );
        Assert.assertNotNull ( cat.doNametoUpperCase () );
    }

    @Test
    public void testSetVoice() {
        Assert.assertNotNull ( cat.setVoice ( "Mayu" ) );
        Assert.assertEquals ( "Myau", cat.setVoice ( "Myau" ) );
    }
}

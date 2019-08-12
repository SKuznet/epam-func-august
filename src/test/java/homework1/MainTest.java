package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Cat cat;
    private Main main;

    @Before
    public void setUp() {
        cat = new Cat ( "Barsik", 5, "black" );
        main = new Main ();
    }

    @Test
    public void testCreateCat() {
        Assert.assertNotNull ( Main.createCat ( "Barsik", 5, "black" ) );
        Assert.assertNotNull ( Main.createCat ( "Barsik", null, "black" ) );
    }
}

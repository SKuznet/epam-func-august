package homework1;

import homework1.cats.Barsik;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatFactoryTest {

    CatFactory catFactory = new CatFactory();

    @Test
    public void testCreateCat() {
        Barsik barsik = new Barsik("Barsik",2);
        assertEquals(barsik.getName(), catFactory.createCat("Barsik").getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalCat() {
        catFactory.createCat("Bars");
    }

}

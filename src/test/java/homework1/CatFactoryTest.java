package homework1;

import homework1.Cats.Vasilii;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CatFactoryTest {
    CatFactory catFactory = new CatFactory();

    @Test
    public void testCreateCat() {
        Vasilii vasilii = new Vasilii("Vasilii", "red", false, false);
        assertEquals(vasilii.getName(), catFactory.createCat("Vasilii").getName());
        assertFalse(catFactory.createCat("Vasilii").isHerbivore());
        assertTrue(catFactory.createCat("Vasilii").isHungry());
    }

    @Test()
    public void testDefaultCat() {
        assertEquals("default", catFactory.createCat("Barsik").getColor());
    }
}

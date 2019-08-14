package homework.task1;

import homework.task1.cats.Cat;
import homework.task1.cats.John;
import homework.task1.cats.Rick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatFabricTest {
    CatFabric catFabric;
    Cat cat;

    @Before
    public void init() {
        catFabric = new CatFabric();
    }

    @Test
    public void testCreateCat() {
        cat = catFabric.createCat("john");
        assertTrue(cat instanceof John);
        cat = catFabric.createCat("rick");
        assertTrue(cat instanceof Rick);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCat2() {
        cat = catFabric.createCat("Barsic");
    }
}
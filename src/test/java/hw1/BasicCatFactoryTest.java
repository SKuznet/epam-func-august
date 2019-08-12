package hw1;

import static org.junit.Assert.*;
import org.junit.Test;

public class BasicCatFactoryTest {

    private Cat basicCat = new BasicCat();

    @Test
    public void createCat() {
        assertEquals(basicCat.getName(), "Barsic");
        assertEquals(basicCat.getDescription(), "Basic Cat");
        assertFalse(basicCat.isBreed());
        assertSame(basicCat.getClass(), BasicCat.class);
    }
}
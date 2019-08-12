package hw1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LuxuryCatFactoryTest {

    private Cat luxuryCat = new LuxuryCat();

    @Test
    public void createCat() {
        assertEquals(luxuryCat.getName(), "Murzik");
        assertEquals(luxuryCat.getDescription(), "Luxury Cat");
        assertTrue(luxuryCat.isBreed());
        assertSame(luxuryCat.getClass(), LuxuryCat.class);
    }
}
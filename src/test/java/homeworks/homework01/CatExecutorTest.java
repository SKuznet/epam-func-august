package homeworks.homework01;

import org.junit.Test;

import static homeworks.homework01.CatExecutor.*;
import static org.junit.Assert.*;

public class CatExecutorTest {
    Cat cat1 = new Cat("cat1", "Male", 12);
    Cat cat2 = new Cat("cat2", "Female", 7);

    @Test
    public void testCloning() {
        StringBuilder testString = new StringBuilder("See how many cats here: ");
        Integer testQuantity = 2;
        testString.append(cat1.getName()).append(" ").append(cat1.getName()).append(" ");
        assertEquals(testString, cloning(cat1, testQuantity));
    }

    @Test
    public void testIncreaseAge() {
        assertEquals(Integer.valueOf(8), increaseAge(cat2));
    }

    @Test
    public void testSetStatus() {
        assertEquals("cat1's sleeping", setStatus(cat1, "sleeping"));
    }

    @Test
    public void testIsOld() {
        assertEquals("cat1 is old.", isOld(cat1));
        assertEquals("cat2 is not so old.", isOld(cat2));
    }

    @Test
    public void testIsFamily() {
        StringBuilder testSb = new StringBuilder("cat1 and cat2 is a family: true ");
        assertEquals(testSb, isFamily(cat1, cat2));
        Cat cat3 = new Cat("cat3", "Male", 9);
        assertEquals(testSb.replace(testSb.length()-5, testSb.length()-1, "false"), isFamily(cat1, cat2));
    }
}
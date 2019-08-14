package hw1;

import hw1.cats.Cat;
import hw1.cats.CatFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private static Main main;
    private static Cat vasya;
    private static Cat barsik;

    @BeforeClass
    public static void main() {
        main = new Main();
        vasya = CatFactory.getCat("Vasya");
        barsik = CatFactory.getCat("Barsik");
    }

    @Test
    public void checkSupplier() {
        assertTrue(main.checkSupplier().getName().equalsIgnoreCase("barsik"));
    }

    @Test
    public void checkPredicate() {
        assertFalse(main.checkPredicate(barsik));
    }

    @Test
    public void checkBiPredicate() {
        assertFalse(main.checkBiPredicate(barsik, vasya));
    }

    @Test
    public void checkFunction() {
        assertTrue(main.checkFunction(barsik).equalsIgnoreCase("barsik"));
    }

    @Test
    public void checkBiFunction() {
        assertTrue(main.checkBiFunction(barsik, vasya).equalsIgnoreCase("barsik and vasya"));
    }

    @Test
    public void checkUnaryOperator() {
        assertTrue(main.checkUnaryOperator(barsik).getName().equalsIgnoreCase("barsik new one"));
    }

    @Test
    public void checkBinaryOperator() {
        assertTrue(main.checkBinaryOperator(barsik, vasya).getName().equalsIgnoreCase("barsik vasya"));
    }
}
package hw1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.function.*;

import static org.junit.Assert.*;

public class MainTest {

    private static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static CatFactory catFactory = new CatFactory();
    private static Cat barsik = catFactory.getCat(Cats.MALE);
    private static Cat murka = catFactory.getCat(Cats.FEMALE);

    @BeforeEach
    public void setUp(){
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void clear() throws IOException {
        outContent.close();
    }

    @Test
    public void factoryTest() throws IOException {
        assertEquals(CatMale.class, barsik.getClass());
        assertEquals(CatFemale.class, murka.getClass());
    }

    @Test
    public void consumerTest(){
        Consumer<Cat> consumer = cat -> System.out.println(cat.call());
        consumer.accept(murka);
        consumer.accept(barsik);
        assertEquals("Murr\r\nMew\r\n", outContent.toString());
    }

    @Test
    public void functionTest(){
        Function<Cat, Integer> function = cat -> cat.call().length();
        System.out.println(function.apply(barsik));
        System.out.println(function.apply(murka));
        assertEquals("3\r\n4\r\n", outContent.toString());
    }

    @Test
    public void unaryAndBinaryOperatorTest(){
        if (barsik.getLives() != 9) {
            barsik.setLives(9);
        }
        UnaryOperator<Cat> unaryOperator = cat -> cat.decrementLives();
        BinaryOperator<Cat> binaryOperator = (c1, c2) -> c1.call().length()>c2.call().length() ? c1 : c2;
        System.out.println(unaryOperator.apply(barsik));
        System.out.println(binaryOperator.apply(barsik, murka));
        assertEquals("Cat{type=class hw1.CatMale, lives=8}\r\nCat{type=class hw1.CatFemale, lives=9}\r\n",
                outContent.toString());
    }

    @Test
    public void predicateTest(){
        if (barsik.getLives() == 9) {
            barsik.decrementLives();
        }
        Predicate<Cat> predicate = cat -> cat.getLives()>8;
        System.out.println(predicate.test(barsik));
        assertEquals("false\r\n", outContent.toString());
    }

    @Test
    public void supplierTest(){
        Supplier<Cat> supplier = () -> new CatFemale();
        System.out.println(supplier.get());
        assertEquals("Cat{type=class hw1.CatFemale, lives=9}\r\n", outContent.toString());
    }
}
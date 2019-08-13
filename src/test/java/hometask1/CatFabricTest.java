package hometask1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatFabricTest {
    private CatFabric catFabric;

    @Before
    public void setUp() throws Exception {
        catFabric = new CatFabric();
    }

    @Test
    public void getAbstractCat1() {
        assertEquals("Hi bro, how do you do man?", catFabric.getAbstractCat("happy").sayHi());
        assertEquals("Hey, you still here, lets go home!", catFabric.getAbstractCat("happy").sayBye());
    }

    @Test
    public void getAbstractCat2() {
        assertEquals("Hi there! I am a new here!", catFabric.getAbstractCat("freshman").sayHi());
        assertEquals("Bye everyone!", catFabric.getAbstractCat("freshman").sayBye());
    }

    @Test
    public void getAbstractCat3() {
        assertEquals("Hello lazy buts!***whispers...soo ruuude!", catFabric.getAbstractCat("rude").sayHi());
        assertEquals("Pfff...who is go home, I'm go home, hah!", catFabric.getAbstractCat("rude").sayBye());
    }
}
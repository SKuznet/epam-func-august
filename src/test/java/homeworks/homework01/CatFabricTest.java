package homeworks.homework01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatFabricTest {

    @Test
    public void testCreate() {
        CatFabric catFabric = new CatFabric();
        assertTrue(catFabric.create("cat", "male", 1) instanceof Cat);
    }
}
package hw1.cats;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatFactoryTest {

    @Test
    public void getCat(){
        String catName = "Murzillo";
        assertEquals(catName, CatFactory.getCat(catName).getName());
    }
}
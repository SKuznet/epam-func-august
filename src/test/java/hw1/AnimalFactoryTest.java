package hw1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalFactoryTest {

    AnimalFactory catFactory;
    AnimalFactory dogFactory;

    @Before
    public void init() {
        catFactory = new CatFactory();
        dogFactory = new DogFactory();
    }

    @Test
    public void testAnimalFactories() {
        Assert.assertEquals(new Cat(), catFactory.animalCreator());
        Assert.assertEquals(new Dog(), dogFactory.animalCreator());
        Assert.assertNotEquals(null, catFactory.animalCreator());
        Assert.assertNotEquals(null, dogFactory.animalCreator());
    }
}

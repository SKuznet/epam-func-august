package homework1;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class CatFactoryTest {
    @Test
    public void createCatTest() {
        CatFactory factory = new CatFactory();
        Cat cat1 = factory.createCat("Murzik", "Maine Coon", 5, 10, "Henry");
        assertTrue(cat1 instanceof CatMaineCoon);
        Cat cat2 = factory.createCat("Laska", "Russian Blue", 5, 10, "Henry");
        assertTrue(cat2 instanceof CatRussianBlue);
        Cat cat3 = factory.createCat("Bob", "Siamese", 5, 10, "Henry");
        assertTrue(cat3 instanceof CatSiamese);
    }
}

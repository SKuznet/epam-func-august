package homework;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static homework.CatCreator.catCreator;

public class CatTest {

    @Test
    public void testCatCreator() {
        List<MyCat> list = null;
        Assert.assertTrue(!catCreator(8).equals(null));
    }
}

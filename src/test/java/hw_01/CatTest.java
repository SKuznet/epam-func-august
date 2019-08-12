package hw_01;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void TestNewCat() {
        Cat cat = new Cat("Vaska");
        cat.setName("Murzik");
        Assert.assertEquals(cat, new Cat("Murzik"));
    }

    @Test(expected = NullPointerException.class)
    public void TestNewCatWithExceptionOneArgument() {
        Cat cat = new Cat(null);
    }

    @Test(expected = NullPointerException.class)
    public void TestNewCatWithExceptionBothNullArguments() {
        Cat cat = new Cat(null, null);

    }

    @Test(expected = NullPointerException.class)
    public void TestNewCatWithExceptionSecondNullArgument() {
        Cat cat = new Cat("Test", null);
    }

    @Test(expected = NullPointerException.class)
    public void TestNewCatWithExceptionFirstNullArgument() {
        Cat cat = new Cat(null, "Test");
    }
}

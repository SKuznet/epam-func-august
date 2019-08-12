package lesson3.hw;

import lesson3.hw.Cat.God;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GodTest {

  private Cat cat;

  @Before
  public void init() {
    cat = God.createCat("Test", 10, 10, true);
  }

  @Test
  public void testCreateCat() {
    Assert.assertEquals(cat.getName(), God.createCat("Test", 10, 10, true).getName());
  }
}

package hw;

import static homeworks.Homework3.getList;
import static org.junit.Assert.assertArrayEquals;

import java.nio.file.Paths;
import org.junit.Test;

public class HomeworkTest {

  @Test(expected = IllegalArgumentException.class)
  public void testWithWrongPath() {
    getList(Paths.get("/qwerty"));
  }

  @Test
  public void testWithCorrectPath() {
    assertArrayEquals(
        new String[]{"http://site1.com", "http://site4.com", "www.site2.com", "www.site3.com"},
        getList(Paths.get("./src/main/resources/repo.csv")));
  }
}

package lesson6.hw2;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CVSParserTest {

  List<String[]> expectedValues;

  @Before
  public void init() {
    expectedValues = new ArrayList<>();
    expectedValues.add(new String[]{"www.epam.com", "www.videoportal.epam.com", "www.telescope.com",
        "www.upsa.com", "www.heroes.com"});
  }

  @Test
  public void testGetData() {
    List<String[]> actualValues = CVSParser.getData("src/main/resources/FileForParse.cvs");
    Assert.assertEquals((expectedValues.get(0))[0], actualValues.get(0)[0]);
  }

}

import static junit.framework.TestCase.assertEquals;

import hw3.CsvParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Hw3Test {


  @Test
  public void getWebsitesFromCsvFile(){
    List<String[]> expected = new ArrayList<>();
    expected.add(new String[]{"https://1000.menu/", "https://povar.ru/", "https://www.edimdoma.ru/", "https://www.ivd.ru/", "https://www.mvideo.ru/", "https://www.russianfood.com/"});

    try {
      assertEquals(Arrays.toString(expected.get(0)), CsvParser.getWebsitesFromCsvFile().toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

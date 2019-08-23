package homeworks.homework02;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ReadCsvTest {
  List<String> list = new ArrayList<>();

  @Test
  public void testFilterUrl() {
    list.add("www.youtube.com");
    list.add("htt://youtube.com");
    list.add("http://www.youtube.com");
    list.add("ww.youtube.com");
    list.add("w.youtube.com");
    list.add("https:/www.youtube.com");

    String[] expectedArray = new String[]{list.get(0), list.get(2), list.get(5)};
    String[] actualArray = ReadCsv.filterUrl(list);

    assertEquals(expectedArray, actualArray);
  }
}
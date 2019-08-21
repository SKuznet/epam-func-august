package homeworkstream;

import java.util.ArrayList;
import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StreamUtilTest {

  @Before
  public void init() {
  }

  @Test
  public void testProcessArray() {

    ArrayList<String> inputData = new ArrayList<>();

    inputData.add("ldjfgnfd");
    inputData.add("www.dflgndfgd.fg");
    inputData.add("dfgdgfd");
    inputData.add("http://dfgdf.dfg.gfd");

    String[] outputData = new  String[]{"http://dfgdf.dfg.gfd", "www.dflgndfgd.fg"};

    assertThat(StreamUtil.processArray(inputData)).isEqualTo(outputData);

  }

  @Test
  public void testReadFromFile() {

    ArrayList<String> outputData = new ArrayList<>();
    outputData.add("www.dfbfd.hgf");
    outputData.add("fghgfh");
    outputData.add("gfhfghfhgfhfhgf");
    outputData.add("fhghgf");
    outputData.add("http://dfgdgf.dgffd.gfd");

    assertThat(StreamUtil.readFromFile("src/test/java/homeworkstream/testdatabase.csv")).isEqualTo(outputData);


  }

}

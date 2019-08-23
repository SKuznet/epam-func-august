package hw2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;

public class Test {

  @org.junit.Test
  public void hwTest() throws IOException {
    Hw2main main = new Hw2main();
    assertEquals("[http://www.google.com, www.acve.uu, www.adadaa, www.epam.com, www.ewe, www.ewfef.ru]",
        Arrays.toString(main.read("CSV/homework.csv")));
  }
}

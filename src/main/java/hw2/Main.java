package hw2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();
    try {
      System.out.println(Arrays.toString(main.read("CSV/homework.csv")));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  String [] read(String filePath) throws IOException {
    File file;
    String regular= "^(www|http)([\\S]*)$";
    file = new File(filePath);
    Stream<String> streamFromFile = Files.lines(file.toPath());
    return streamFromFile.sorted().filter((s -> s.matches(regular))).toArray(String[]::new);
  }

}

package lesson6.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CVSParser {

  private static List<String[]> values;

  public static List<String[]> getData(String filePath) {
    Path path = Paths.get(filePath);
    if (Files.exists(path)) {
      try (Stream<String> lines = Files.lines(path)) {
        values = lines.map(line -> (line.split(";"))).collect(Collectors.toList());
        return values;
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return Collections.EMPTY_LIST;
  }

  public static void printValues() {
    for (String[] s : values) {
      for (String s2 : s) {
        System.out.print(s2);
      }
    }

  }
}

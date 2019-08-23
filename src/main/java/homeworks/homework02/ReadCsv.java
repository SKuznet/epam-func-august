package homeworks.homework02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Homework 2:
 * Create CSV file and fill it up with URLs. Using Stream API, create an array contains lines of file
 * which has "www" or "http" within. CSV file is in resources folder.
 */
public class ReadCsv {
  public static void main(String[] args) {
    String path = "C:\\studyjava\\epam-func-august\\src\\main\\resources\\homework02.csv";
    List<String> list = null;
    try {
      list = Files.lines(Paths.get(path)).collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("List: " + list);
    System.out.println("Filtered list: " + Arrays.toString(filterUrl(list)));
  }

  public static String[] filterUrl(List<String> list){
    String[] filteredList = new String[0];
    if (list != null) {
      filteredList = list.stream()
          .filter((s) -> s.contains("www") || s.contains("http"))
          .toArray(String[]::new);
    }
    return filteredList;
  }
}
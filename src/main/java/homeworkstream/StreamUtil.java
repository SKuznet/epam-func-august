package homeworkstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class StreamUtil {

  static String[] processArray(ArrayList<String> array){

    return array.stream().filter(s-> s.contains("http")||s.contains("www")).sorted().toArray(String[]::new);
  }

  static ArrayList<String> readFromFile(String filename) {

    ArrayList<String> readedStrings = new ArrayList<>();

    try (BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {

      String line;
      while ((line = br.readLine()) != null) {
        readedStrings.add(line);
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return  readedStrings;
  }

}

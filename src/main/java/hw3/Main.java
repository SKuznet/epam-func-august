package hw3;

import static hw3.CsvParser.getWebsitesFromCsvFile;

import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    try {
      System.out.println(getWebsitesFromCsvFile());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

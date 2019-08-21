package lesson6.hw2;

public class ParserAppStart {

  public static void main(String[] args) {
    CVSParser.getData("src/main/resources/FileForParse.cvs");
    CVSParser.printValues();
  }

}

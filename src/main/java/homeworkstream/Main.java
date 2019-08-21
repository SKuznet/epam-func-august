package homeworkstream;


public class Main {

  public static void main(String[] args) {

    String[] strArray = StreamUtil.processArray(StreamUtil.readFromFile("src/main/java/homeworkstream/database.csv"));

    for(int i=0;i<strArray.length;i++) {
      System.out.println(strArray[i]);
    }

  }

}

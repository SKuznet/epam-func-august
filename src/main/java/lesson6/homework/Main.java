package lesson6.homework;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/sites.csv";
        StreamCSVParser streamCSVParser = new StreamCSVParser();
        String[] strings = streamCSVParser.getSortedArrayContainsWebElements(streamCSVParser.getStreamFromFilePath(filePath));

        for (String string : strings) {
            System.out.println(string);
        }
    }
}

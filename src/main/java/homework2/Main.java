package homework2;

import java.util.List;

public class Main {

    private final static String FILE_PATH = "src\\main\\resources\\websites.csv";

    public static void main(String[] args) {
        FileParser parser = new FileParser();
        List<String> parseResult = parser.parseFile(FILE_PATH);
        parseResult.forEach(System.out::println);
    }
}

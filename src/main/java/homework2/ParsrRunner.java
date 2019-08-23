package homework2;

import java.util.Arrays;
import java.util.List;

public class ParsrRunner {
    public static final String FILE_NAME = "src/main/resources/input.csv";

    public static void main(String[] args) {
        Parser parser = new Parser();
        List<String> data = parser.parseFile(FILE_NAME);
        System.out.println(Arrays.toString(data.toArray()));
    }
}

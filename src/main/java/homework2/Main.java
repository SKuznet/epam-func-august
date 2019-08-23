package homework2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        List<String> result = parser.parseCsvFile("src\\main\\resources\\source.csv");
        for (String s: result) {
            System.out.println(s);
        }
    }
}

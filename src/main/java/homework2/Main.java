package homework2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        List<String> res = parser.getList();
        res.forEach(System.out::println);
    }
}

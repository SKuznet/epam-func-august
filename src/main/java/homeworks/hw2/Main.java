package homeworks.hw2;

import java.util.List;

public class Main {

    public static final String path = "src\\main\\resources\\deutsch.csv";

    public static void main(String[] args) {
        List<String> sites = Csv2ListParser.parse(path);
        sites.forEach(System.out::println);
    }
}

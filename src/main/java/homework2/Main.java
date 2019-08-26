package homework2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\Zstudent\\IdeaProjects\\Java8\\epam-func-august\\src\\main\\resources\\homework2\\testCsv.csv";
        List<String> parsedFileCsv = CsvParser.parseCsvFile(path);
        parsedFileCsv.forEach(System.out::println);
    }
}

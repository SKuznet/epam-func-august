package homeworks.hw2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static final String path = "C:\\Projects\\epam-func-august\\src\\main\\resources\\deutsch.csv";
    static List<String> stringList;

    public static void main(String[] args) {
        try {
            Stream<String> stringStream = Files.lines(Paths.get(path));
            stringList = stringStream.flatMap(s -> Stream.of(s.split(",")))
                    .collect(Collectors.toList());
            stringList.stream().forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("There are no such file");
        }

    }
}

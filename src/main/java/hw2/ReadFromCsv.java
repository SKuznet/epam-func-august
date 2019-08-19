package hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFromCsv {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        List<String> listUrl = new ArrayList<>();

        try {
            String path = System.getProperties().getProperty("user.dir");
            String filename = path + "/src/main/resources/websites.csv";
            try (Stream<String> streamFromFile = Files.lines(Paths.get(filename))) {
                list = streamFromFile
                        .map(l -> l.split(","))
                        .skip(1)
                        .collect(Collectors.toList());

                for (String[] strings : list) {
                    String url = strings[0];
                    if (url.contains("www") || url.contains("http")) {
                        listUrl.add(url);
                    }
                }

                List<String> urlList = listUrl.stream().sorted().collect(Collectors.toList());
                urlList.forEach(System.out::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package hw2;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class CsvParser {

    private List<Cat> processInputFile(String inputFilePath) throws FileNotFoundException {
        InputStream is = new FileInputStream(new File("cats.csv"));
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        List<Cat> cats = br.lines()
                .map(mapToPerson)
                .filter(cat -> cat.getAge() > 17)
                .limit(50)
                .collect(toList());
        return cats;
    }
    public static Function<String, Cat> mapToPerson = (line) -> {
        String[] p = line.split(", ");
        return new Cat(p[0], Integer.parseInt(p[1]), p[2], p[3]);
    };

}

package homework2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String fullPath = System.getProperty("user.dir") + "/src/main/resources/example.csv";
            List filtered = CSVParser.parse(fullPath);
            if (!filtered.isEmpty()) {
                System.out.println(filtered);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

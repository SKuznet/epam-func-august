package homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileParser {
    public static String[] getList(String path) {
        String[] list = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))))) {
            list = reader.lines()
                    .filter(a -> a.contains("www") || a.contains("http"))
                    .toArray(String[]::new);
        } catch (IOException e) {
            System.err.println(e);
        }
        return list;
    }
}

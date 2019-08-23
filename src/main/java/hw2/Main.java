package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> list = Files.lines(Paths.get(reader.readLine())).filter(x -> x.startsWith("www") || x.startsWith("http")).collect(Collectors.toList());
            System.out.println(Arrays.toString(list.toArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

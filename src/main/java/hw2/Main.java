package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        System.out.println(Arrays.toString(parser.getList("C:\\Users\\Artem_Esin\\IdeaProjects\\epam-func\\src\\main\\resources\\list.csv")));
    }
}

package hw2;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Parser parser = new Parser();
        System.out.println(Arrays.toString(parser.getList("c:/users/Михаил/IdeaProjects/epamfunc/src/main/resources/spisok.csv")));
    }
}

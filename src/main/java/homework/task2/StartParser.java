package homework.task2;

public class StartParser {
    private static final String PATH_TO_FILE = "/Users/anton/IdeaProjects/epam-func-august/src/main/resources/list.csv";
    public static void main(String[] args) {
        Parser parser = new Parser();
        String stringWithWWW = parser
                .getParserList(PATH_TO_FILE)
                .toString();
        System.out.println(stringWithWWW);
    }
}

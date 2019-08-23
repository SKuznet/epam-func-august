package homework.hw2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Links parse results:");
        System.out.println(CustomCSVParser.filterWebPages("src/main/resources/watchers_with_links.csv"));
    }
}

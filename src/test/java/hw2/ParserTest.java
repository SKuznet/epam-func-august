package hw2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    private String[] strings = new String[]{"www.google.com", "www.yandex.ru", "www.vk.com", "www.yahoo.com"};
    private Parser parser = new Parser();
    private String fileInput = "c:/users/Михаил/IdeaProjects/epamfunc/src/main/resources/spisok.csv";

    @Test
    public void getList() {
        assertEquals(strings, parser.getList(fileInput));
    }
}
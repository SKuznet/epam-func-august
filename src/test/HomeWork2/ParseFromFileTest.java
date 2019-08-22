package HomeWork2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParseFromFileTest {

    private String[] strings = new String[]{"www.google.com", "www.yandex.ru", "www.vk.com", "www.yahoo.com"};
    private ParseFromFile parser = new ParseFromFile();
    private String fileInput = "C:\\Users\\Makintosh\\IdeaProjects\\epam-func\\src\\main\\resources\\list.csv";

    @Test
    public void getList() {
        assertEquals(strings, parser.getList(fileInput));
    }

}
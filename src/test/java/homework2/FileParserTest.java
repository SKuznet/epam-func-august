package homework2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FileParserTest {

    @Test
    public void getListTest(){
        String[] result = new String[]{"www.google.com", "www.yandex.com","https://github.com/"};
        FileParser parser = new FileParser();
        String path = "G:\\projects\\epam-func-august\\src\\main\\resources\\listToParse.csv";
        assertEquals(result, FileParser.getList(path));
    }
}

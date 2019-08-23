package homework3;

import homework2.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    Parser parser = new Parser();

    @Test
    public void testParseCsvFile(){
        String fileName = "C:\\Users\\dima\\IdeaProjects\\epam-func-august\\src\\main\\resources\\source.csv";
        assertFalse(parser.parseCsvFile(fileName).isEmpty());
    }

    @Test
    public void testIsEmpty(){
        String fileName = "";
        assertTrue(parser.parseCsvFile(fileName).isEmpty());
    }
}

package hometask2;

import org.junit.Before;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StreamHomeTaskTest {
    private StreamHomeTask streamHomeTask;

    @Before
    public void setUp() throws Exception {
        streamHomeTask = new StreamHomeTask();
    }

    @Test
    public void getFileContentAsSortedListTest1() {
        assertEquals(new ArrayList<String>(), streamHomeTask.getFileContentAsSortedList(Paths.get("unknownPath")));
    }

    @Test
    public void getFileContentAsSortedListTest2() {
        ArrayList<String> sortedList = new ArrayList<String>() {{
            add("https://english-films.com");
            add("https://grant.rscf.ru");
            add("https://mail.ru");
            add("https://twitter.com");
            add("www.ets.org");
            add("www.facebook.com");
            add("www.instagram.com/evgenii.m_v/");
        }};
        assertEquals(sortedList, streamHomeTask.getFileContentAsSortedList(Paths.get("src/main/resources/container.csv")));
    }
}
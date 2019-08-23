package homework2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseCSVTest {
    private List<String> list;
    private Stream<String> stream;

    @Before
    public void init() {
        list = Arrays.asList("https://telescope.epam.com/who/fedor_glushchenko", "WHOWHO", "www.island.com", "htt://asd.sa", "clownhttp://asd", "ww.lol.ru", "crazywww.lol.comlink");
        stream = list.stream();
    }

    @Test
    public void testReadStream() {
        List<String> filteredList = list
                .stream()
                .filter(o -> o.indexOf("www") == 0 || o.indexOf("http") == 0)
                .collect(Collectors.toList());

        Assert.assertEquals(filteredList, ParseCSV.readStream(stream));
        stream = list.stream();
        Assert.assertNotEquals(list, ParseCSV.readStream(stream));
    }
}

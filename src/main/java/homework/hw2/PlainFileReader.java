package homework.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PlainFileReader implements StreamReader<String,Path>{

    @Override
    public Stream<String> getStreamFromResource(Path pathToFile) {
        try {
            return Files.lines(pathToFile);
        } catch (IOException e){
            System.out.println();
            return Stream.empty();
        }
    }
}

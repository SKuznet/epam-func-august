package homework.hw2;

import java.util.stream.Stream;

public interface StreamReader<T,K> {
    public abstract Stream<T> getStreamFromResource(K pathToFile);
}

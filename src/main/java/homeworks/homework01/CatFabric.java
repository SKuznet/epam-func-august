package homeworks.homework01;

import java.util.function.Supplier;

/**
 * This class provides to make cats via factory
 */
public class CatFabric {
    public Cat create(String name, String sex, Integer age) {
        Supplier<Cat> supplier = () -> new Cat(name, sex, age);
        return supplier.get();
    }
}

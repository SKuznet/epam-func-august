package homeworks;

import java.util.function.Supplier;

public class CatFabric {
    public Cat create(String name, String sex, Integer age){
        Supplier<Cat> supplier = () -> new Cat(name, sex, age);
        return supplier.get();
    }
}

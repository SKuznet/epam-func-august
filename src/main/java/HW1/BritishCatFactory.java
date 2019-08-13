package HW1;

import java.util.function.Supplier;

public class BritishCatFactory extends CatFactory {
    @Override
    public Cat create(){
        return s2.get();
    }
    Supplier<BritishCat> s2 = () -> new BritishCat();
}

package HW1;

import java.util.function.Supplier;

public class SiamCatFactory extends CatFactory {
    @Override
    public Cat create(){
        return s1.get();
    }
    Supplier<SiamCat> s1 = () -> new SiamCat();
}

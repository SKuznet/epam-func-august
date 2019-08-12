package HW1;

public class SiamCatFactory extends CatFactory {
    @Override
    Cat create(){
        return new SiamCat();
    }
}

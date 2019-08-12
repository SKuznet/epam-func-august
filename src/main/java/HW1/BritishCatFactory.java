package HW1;

public class BritishCatFactory extends CatFactory {

    @Override
    Cat create(){
        return new BritishCat();
    }


}

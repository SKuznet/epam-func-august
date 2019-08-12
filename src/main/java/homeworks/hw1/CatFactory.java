package homeworks.hw1;

public class CatFactory {
    public static Cat getCat(String name, Breed breed) {
        switch (breed) {
            case MUNCHKIN:
                return new Munchkin(name);
            case BRITISH:
                return new British(name);
            case MAINE_COON:
                return new MaineCoon(name);
            default:
                return new Cat(name);
        }
    }

    public static Cat getCat(String name){
        return new Cat(name);
    }
}

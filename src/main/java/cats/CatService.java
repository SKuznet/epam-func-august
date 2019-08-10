package cats;

public class CatService {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", true, true);
        Cat murzik = new Cat("Murzik", true, false);
        checkCat(barsik, O -> O.isHerbivore());
        checkCat(murzik, C -> C.isHerbivore());
    }


    private static void checkCat(Cat cat, CheckCat checkCat) {
        if (checkCat.check(cat)) {
            System.out.println(cat);
        }

    }
}

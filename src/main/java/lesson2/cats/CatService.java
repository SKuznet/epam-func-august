package lesson2.cats;

public class CatService {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", true, true);
        Cat murzik = new Cat("Murzik", true, false);

        checkCat(barsik, O -> O.isHerbivore());
        checkCat(barsik, c -> c.isHungry());
        checkCat(murzik, a -> a.isHerbivore());
        checkCat(murzik, cat -> cat.isHungry());

    }

    private static void checkCat(Cat cat, CheckCat checkCat){
        if (checkCat.check(cat)){
            System.out.println(cat);
        }
    }
}

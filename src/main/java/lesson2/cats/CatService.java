package lesson2.cats;

public class CatService {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", true, true);
        Cat murzik = new Cat("Murzik", true, false);

        CheckCat o = new CheckCat() {
            @Override
            public boolean check(Cat cat) {
                return cat.isHerbivore();
            }
        };
        checkCat(barsik, new CheckCat() {
            @Override
            public boolean check(Cat cat) {
                return cat.isHerbivore();
            }
        });

        checkCat(barsik, o);

        checkCat(barsik, O -> O.isHerbivore());
        checkCat(barsik, c -> c.isHungry());
        checkCat(murzik, A -> A.isHerbivore());
        checkCat(murzik, cat -> cat.isHungry());
    }

    private static void checkCat(Cat cat, CheckCat checkCat) {
        if (checkCat.check(cat)) {
            System.out.println(cat);
        }
    }
}

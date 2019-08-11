package hometasks.hometask1;

import java.util.Random;
import java.util.function.*;

public class Main {
    static final Random randomizer = new Random();

    public static void main(String[] args) {

        Cat abyssinianCat = CatFactory.createCat("Gamma", 3, "Abyssinian");
        Cat aegeanCat = CatFactory.createCat("Delta", 5, "Aegean");

        Consumer<Cat> displayCatName = cat -> System.out.println(cat.getName());
        BiConsumer<Cat, Cat> displayCatsNames = (cat1, cat2) -> System.out.println(cat1.getName() + " " + cat2.getName());
        displayCatName.accept(abyssinianCat);
        displayCatsNames.accept(abyssinianCat, aegeanCat);

        Function<Cat, String> getBreed = Cat::getBreed;
        BiFunction<Cat, Cat, Integer> getAgeSum = (cat1, cat2) -> cat1.getAge() + cat2.getAge();
        System.out.println(getBreed.apply(abyssinianCat));
        System.out.println(getAgeSum.apply(abyssinianCat, aegeanCat));

        UnaryOperator<Cat> catAgePlusPlus = cat -> {
            cat.setAge(cat.getAge() + 1);
            return cat;
        };
        BinaryOperator<Cat> getChild = (cat1, cat2) -> new Cat(cat1.getName() + cat2.getName() + "Child", 0) {
            {
                breed = cat1.getBreed() + "-" + cat2.getBreed();
            }
        };
        System.out.println(catAgePlusPlus.apply(abyssinianCat));
        System.out.println(getChild.apply(abyssinianCat, aegeanCat));

        Predicate<Cat> isAegean = (cat) -> cat.getBreed().equalsIgnoreCase("aegean");
        BiPredicate<Cat, Cat> areSameBreed = (cat1, cat2) -> cat1.getBreed().equalsIgnoreCase(cat2.getBreed());
        System.out.println("isAegean {expected: true}: " + isAegean.test(aegeanCat));
        System.out.println("areSameBreed {expected: false} " + areSameBreed.test(aegeanCat, abyssinianCat));

        Supplier<Cat> aegeanCatNamedJoeSuplier = () -> CatFactory.createCat("Joe", randomizer.nextInt(15),
                "aegean");
        System.out.println(aegeanCatNamedJoeSuplier.get());
    }
}

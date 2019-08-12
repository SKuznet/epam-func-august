package lesson3.homework;

import lesson3.homework.cats.Cat;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<Cat> supplier = () -> CatFactory.createCat("Barsik");
        System.out.println(supplier.get());

        Predicate<Cat> predicate = cat -> cat != null;
        System.out.println(predicate.test(CatFactory.createCat("Murzik")));

        BiPredicate<Cat, Cat> biPredicate = (cat1, cat2) -> cat1.equals(cat2);
        System.out.println(biPredicate.test(CatFactory.createCat("Barsik"),CatFactory.createCat("Murzik")));

        UnaryOperator<Cat> unaryOperator = cat -> cat.play();
        System.out.println(unaryOperator.apply(CatFactory.createCat("Barsik")));

        BinaryOperator<Cat> binaryOperator = (cat1, cat2) -> cat1.play(cat2);
        System.out.println(binaryOperator.apply(CatFactory.createCat("Barsic"),CatFactory.createCat("Murzik")));

        Function<Cat, String> function = cat -> cat.getName();
        System.out.println(function.apply(CatFactory.createCat("Murzik")));

        BiFunction<Cat, Cat, String> biFunction = (cat1, cat2) -> cat1.getName() + " and " + cat2.getName();
        System.out.println(biFunction.apply(CatFactory.createCat("Barsik"), CatFactory.createCat("Murzik")));

        Consumer<Cat> catConsumer = cat -> cat.setName("Murzik");
        Cat cat = CatFactory.createCat("Barsik");
        catConsumer.accept(cat);
        System.out.println(cat.getName());
    }

}

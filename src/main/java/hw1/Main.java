package hw1;

import hw1.cats.Cat;
import hw1.cats.CatFactory;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Cat vasya = CatFactory.getCat("Vasya");
        Cat barsik = main.checkSupplier();

        main.checkConsumer(barsik);
        main.checkBiConsumer(barsik, vasya);
        main.checkPredicate(barsik);
        main.checkBiPredicate(barsik, vasya);
        main.checkFunction(barsik);
        main.checkBiFunction(barsik, vasya);
        main.checkUnaryOperator(barsik);
        main.checkBinaryOperator(barsik, vasya);
    }

    Cat checkSupplier() {
        Supplier<Cat> supplier = () -> new Cat("Barsik");
        return supplier.get();
    }

    void checkConsumer(Cat barsik) {
        Consumer<Cat> consumer = cat -> System.out.println(cat.getName());
        consumer.accept(barsik);
    }

    void checkBiConsumer(Cat barsik, Cat vasya) {
        BiConsumer<Cat, Cat> biconsumer = (cat1, cat2) -> System.out.println(cat1.getName() + ", " + cat2.getName());
        biconsumer.accept(barsik, vasya);
    }

    boolean checkPredicate(Cat barsik) {
        Predicate<Cat> predicate = (cat1) -> cat1.getName().isEmpty();
        return predicate.test(barsik);
    }

    boolean checkBiPredicate(Cat barsik, Cat vasya) {
        BiPredicate<Cat, Cat> bipredicate = (cat1, cat2) -> cat1.getName().equalsIgnoreCase(cat2.getName());
        return bipredicate.test(barsik, vasya);
    }

    String checkFunction(Cat barsik) {
        Function<Cat, String> function = (cat1) -> cat1.getName();
        return function.apply(barsik);
    }

    String checkBiFunction(Cat barsik, Cat vasya) {
        BiFunction<Cat, Cat, String> bifunction = (cat1, cat2) -> cat1.getName() + " and " + cat2.getName();
        return bifunction.apply(barsik, vasya);
    }

    Cat checkUnaryOperator(Cat barsik) {
        UnaryOperator<Cat> unaryOperator = (cat1) -> CatFactory.getCat(cat1.getName() + " new one");
        return unaryOperator.apply(barsik);
    }

    Cat checkBinaryOperator(Cat barsik, Cat vasya) {
        BinaryOperator<Cat> binaryOperator = (cat1, cat2) -> CatFactory.getCat(cat1.getName() + " " + cat2.getName());
        return binaryOperator.apply(barsik, vasya);
    }
}

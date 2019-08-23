package hw_01;

import hw_01.impl.BadCatFactory;
import hw_01.impl.GoodCat;
import hw_01.impl.GoodCatFactory;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    private static Cat goodCat;
    private static Cat badCat;

    public static void main(String[] args) {
        Factory goodCatFactory = new GoodCatFactory();
        Factory badCatFactory = new BadCatFactory();
        goodCat = goodCatFactory.getCat("Vaska");
        badCat = badCatFactory.getCat("Murka");
        doConsumerExample();
        doFunctionExample();
        doUnaryOperatorExample();
        doBinaryOperatorExample();
        doPredicateExample();
        doSupplierExample();
    }

    private static void doConsumerExample() {
        Consumer<Cat> consumer = c -> System.out.println(c);
        consumer.accept(goodCat);
    }

    private static void doFunctionExample() {
        Function<Cat, Boolean> function = c -> c.getName().equals("Murzik");
        System.out.println(goodCat + " is Murzik? --> " + function.apply(goodCat));
    }

    private static void doUnaryOperatorExample() {
        UnaryOperator<Cat> perfectCatCreator = c -> new GoodCat(c.getName(), "I am perfect!");
        System.out.println(perfectCatCreator.apply(badCat));
    }

    private static void doBinaryOperatorExample() {
        BinaryOperator<Cat> binaryOperator = (c, s) -> new Cat(c.getName() + "-" + s.getName(), "I am child");
        System.out.println(binaryOperator.apply(goodCat, badCat));
    }

    private static void doPredicateExample() {
        Predicate<Cat> predicate = c -> c.getName().equals("Vaska");
        System.out.println(goodCat + " is Vaska? --> " + predicate.test(goodCat));
    }

    private static void doSupplierExample() {
        Supplier<Cat> playfulCatFactory = () -> new Cat("Muska", "Let's play together, right now, oh e");
        Cat depecheModeCat = playfulCatFactory.get();
        System.out.println(depecheModeCat);
    }
}
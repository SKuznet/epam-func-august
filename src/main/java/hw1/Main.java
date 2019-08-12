package hw1;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat barsik = catFactory.getCat(Cats.MALE);
        Cat murka = catFactory.getCat(Cats.FEMALE);

        Consumer<Cat> consumer = cat -> System.out.println(cat.call());
        System.out.println("Consumer method output:");
        consumer.accept(barsik);
        consumer.accept(murka);

        Function<Cat, Integer> function = cat -> cat.call().length();
        System.out.println("\nFunction method output:");
        System.out.println(function.apply(barsik));
        System.out.println(function.apply(murka));

        UnaryOperator<Cat> unaryOperator = cat -> cat.decrementLives();
        BinaryOperator<Cat> binaryOperator = (c1, c2) -> c1.call().length() > c2.call().length() ? c1 : c2;
        System.out.println("\nUnary and Binary operator output:");
        System.out.println(unaryOperator.apply(barsik));
        System.out.println(binaryOperator.apply(barsik, murka));

        Predicate<Cat> predicate = cat -> cat.getLives() > 8;
        System.out.println("\nPredicate function output:");
        System.out.println(predicate.test(barsik));

        Supplier<Cat> supplier = () -> new CatFemale();
        System.out.println("\nSupplier function output:");
        System.out.println(supplier.get());

    }
}

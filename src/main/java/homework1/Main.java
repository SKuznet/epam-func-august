package homework1;

import java.awt.*;
import java.util.function.*;

/**
 * Functional interface practice
 */
public class Main {
    public static void main(String[] args) {
        CatFunc catOne = CatFunc.CatFactory.createCat("Barsik", 10);
        CatFunc catTwo = CatFunc.CatFactory.createCat("Snezhok", 200);
        CatFunc catNoName = CatFunc.CatFactory.createCat(5);
        CatFunc catThree = CatFunc.CatFactory.createCat("Tom", 5, true);

        Function<CatFunc, Color> function = f -> f.getCatColor();
        System.out.println(function.apply(catOne));
        System.out.println(function.apply(catTwo) + "\n");

        BiFunction<CatFunc, CatFunc, Color> biFunction = (f1, f2) -> f1.getHeaviestCatColor(f2);
        System.out.println(biFunction.apply(catOne, catTwo) + "\n");

        Consumer<CatFunc> consumer = c -> System.out.println(c.getName() + "\n");
        consumer.accept(catOne);

        BiConsumer<CatFunc, CatFunc> biConsumer = (c1, c2) -> System.out.println(c1.getTwoNames(c2) + "\n");
        biConsumer.accept(catOne, catTwo);

        UnaryOperator<CatFunc> unaryOperator = u -> u.upperCaseNameCat();
        System.out.println(unaryOperator.apply(catOne).name + "\n");

        BinaryOperator<CatFunc> binaryOperator = (b1, b2) -> b1.motherCat(b2);
        System.out.println(binaryOperator.apply(catOne, catTwo).name + "\n");

        Predicate<CatFunc> predicate = p -> p.hasName();
        System.out.println(predicate.test(catOne));
        System.out.println(predicate.test(catNoName) + "\n");

        BiPredicate<CatFunc, CatFunc> biPredicate = (b1, b2) -> b1.equals(b2);
        System.out.println(biPredicate.test(catOne, catOne));
        System.out.println(biPredicate.test(catOne, catTwo) + "\n");

        Supplier<CatFunc> supplier = () -> catOne;
        System.out.println(supplier.get() + "\n");

        CatFunc.checkCat(catThree, c -> c.isHungry());
        CatFunc.printWeight(catThree, c -> c.getWeight());
    }
}

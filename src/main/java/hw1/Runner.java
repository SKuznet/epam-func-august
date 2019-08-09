package hw1;

import java.util.Arrays;
import java.util.function.*;

public class Runner {
    public static void main(String[] args) {

        BasicCatFactory basicCatFactory = new BasicCatFactory();
        LuxuryCatFactory luxuryCatFactory = new LuxuryCatFactory();

        Cat basicCat = basicCatFactory.createCat();
        Cat luxuryCat = luxuryCatFactory.createCat();

        Consumer<Cat> catConsumer = c -> System.out.println(c.getName());
        catConsumer.accept(basicCat);
        catConsumer.accept(luxuryCat);

        BiConsumer<Cat, Cat> catBiConsumer = (cat1, cat2) ->
                System.out.println(cat1.getDescription() + " and " + cat2.getDescription());
        catBiConsumer.accept(basicCat, luxuryCat);

        Function<Cat, String> catStringFunction = cat -> cat.toString();
        System.out.println(catStringFunction.apply(basicCat));
        System.out.println(catStringFunction.apply(luxuryCat));

        BiFunction<Cat, Cat, String> catStringBiFunction = (cat1, cat2) -> cat1.toString().concat(cat2.toString());
        System.out.println(catStringBiFunction.apply(basicCat, luxuryCat));

        UnaryOperator<String> unaryOperator = s -> String.valueOf(s.length());
        System.out.println(unaryOperator.apply(basicCat.getDescription()));
        System.out.println(unaryOperator.apply(luxuryCat.getDescription()));

        BinaryOperator<String> binaryOperator = (b1, b2) -> String.valueOf((b1.concat(b2)).length());
        System.out.println(binaryOperator.apply(basicCat.getDescription(), luxuryCat.getDescription()));

        Predicate<Cat> predicate = p -> p.isBreed();
        System.out.println(predicate.test(basicCat));
        System.out.println(predicate.test(luxuryCat));

        BiPredicate<Cat, Cat> catBiPredicate = (cat1, cat2) -> cat1.getName().equals(cat2.getName());
        System.out.println(catBiPredicate.test(basicCat, luxuryCat));

        Supplier<Cat> catSupplier1 = () -> new BasicCat();
        System.out.println(catSupplier1.get().getName());

        Supplier<Cat> catSupplier2 = () -> new LuxuryCat();
        System.out.println(catSupplier2.get().getName());

        Supplier<Cat[]> supplier = () -> new Cat[]{basicCat, luxuryCat};
        System.out.println(Arrays.toString(supplier.get()));
    }
}

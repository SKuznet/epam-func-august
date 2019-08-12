package homeworks.homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        CatFactory redCatFactory = new RedCatFactory();
        CatFactory blackCatFactory = new BlackCatFactory();
        Cat blackCat = blackCatFactory.createCat();
        Cat redCat = redCatFactory.createCat();

        line();
        Consumer<Cat> catConsumer = cat -> System.out.println(cat.getColor());
        catConsumer.accept(blackCat);
        catConsumer.accept(redCat);
        line();

        Map<Integer, String> cats = new HashMap<>();
        BiConsumer<Integer, Cat> biConsumer = (integer, cat) -> cats.put(integer, cat.getColor());
        biConsumer.accept(1, blackCat);
        biConsumer.accept(2, redCat);
        System.out.println(cats);
        line();

        Function<Cat, String> function = cat -> cat.getColor().toUpperCase();
        System.out.println(function.apply(blackCat));
        System.out.println(function.apply(redCat));
        line();

        BiFunction<Cat, Cat, String> biFunction = (cat, cat2) -> cat.getColor().concat(" and ").concat(cat2.getColor());
        System.out.println(biFunction.apply(blackCat, redCat));
        line();

        UnaryOperator<Cat> unaryOperator = cat -> cat.setColor("White");
        unaryOperator.apply(blackCat);
        System.out.println(blackCat.getColor());
        line();

        BinaryOperator<Cat> binaryOperator = (cat, cat2) -> cat.setColor(cat2.getColor());
        System.out.println(binaryOperator.apply(blackCat, redCat).getColor());
        line();

        Predicate<Cat> catPredicate = cat -> cat.getColor().equals("White");
        System.out.println(catPredicate.test(blackCat));
        line();

        BiPredicate<Cat, Cat> biPredicate = (cat, cat2) -> cat.getColor().equals(cat2.getColor());
        System.out.println(biPredicate.test(blackCat, redCat));
        line();

        Supplier<Cat> catSupplier = () -> new BlackCat();
        System.out.println(catSupplier.get().getColor());
    }


    private static void line() {
        System.out.println();
    }
}

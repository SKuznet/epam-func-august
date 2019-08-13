package homework1;

import homework1.cats.Cat;
import homework1.cats.CatFactory;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class Application {
    /**
     * Java 8 Function interfaces examples of usage.
     * @param args command line args
     */
    public static void main(String[] args) {
        Cat barsik = CatFactory.getCat("Barsik");
        Cat murzik = CatFactory.getCat("Murzik");

        Supplier<Cat> supplier = () -> new Cat("Riska");
        Cat riska = supplier.get();

        Function<Cat, String> function = cat -> cat.getName();
        System.out.println(function.apply(barsik));

        BiFunction<Cat, Cat, String> biFunction = (cat1, cat2) -> {
            return cat1.getName() + " and " + cat2.getName() + " are friends!";
        };
        System.out.println(biFunction.apply(barsik, murzik));

        Consumer<Cat> consumer = (cat) -> System.out.println(cat.getName());
        consumer.accept(riska);

        BiConsumer<Cat, Cat> biConsumer = (cat1, cat2) -> System.out.println(cat1.getName() + ", " + cat2.getName());
        biConsumer.accept(riska, murzik);

        Predicate<Cat> predicate = (cat) -> cat.getName().isEmpty();
        System.out.println(predicate.test(barsik));

        BiPredicate<Cat, Cat> biPredicate = (cat1, cat2) -> cat1.getName().equalsIgnoreCase(cat2.getName());
        System.out.println(biPredicate.test(barsik, riska));

        UnaryOperator<Cat> unaryOperator = (cat) -> new Cat(cat.getName() + " is nice cat");
        System.out.println(unaryOperator.apply(barsik).getName());

        BinaryOperator<Cat> binaryOperator = (cat1, cat2) -> new Cat(cat1.getName() + " with " + cat2.getName());
        System.out.println(binaryOperator.apply(barsik, murzik).getName());
    }
}

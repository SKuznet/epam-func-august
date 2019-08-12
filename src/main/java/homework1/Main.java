package homework1;

import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Cat barsik = CatFactory.getCat("Barsik");
        Cat murzik = CatFactory.getCat("Murzik");

        Supplier<Cat[]> supplier = () -> new Cat[]{barsik, murzik};
        System.out.println("Supplier: " + Arrays.toString(supplier.get()));

        Consumer<Cat> consumer = a -> System.out.println("Consumer: " + a.toString());
        consumer.accept(barsik);

        Predicate<Cat> predicate = a -> a.equals(barsik);
        System.out.println("Predicate: " + predicate.test(barsik));

        BiPredicate<Cat, Cat> biPredicate = (a, b) -> a.equals(b);
        System.out.println("BiPredicate: " + biPredicate.test(barsik, murzik));

        UnaryOperator<Cat> unaryOperator = a -> CatFactory.getCat(a.getName().toUpperCase());
        System.out.println("UnaryOperator: " + unaryOperator.apply(barsik));

        BinaryOperator<Cat> binaryOperator = (a, b) -> CatFactory.getCat(a.getName().toUpperCase() + ", " +
                b.getName().toUpperCase());
        System.out.println("BinaryOperator: " + binaryOperator.apply(barsik, murzik));

        Function<Cat, String> function = a -> a.getName().toUpperCase();
        System.out.println("Function: " + function.apply(murzik));

        BiFunction<Cat, Cat, String> biFunction = (a, b) -> a.getName().toUpperCase() + " and " +
                b.getName().toUpperCase();
        System.out.println("BiFunction: " + biFunction.apply(barsik, murzik));
    }
}

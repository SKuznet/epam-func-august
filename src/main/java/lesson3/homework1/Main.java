package lesson3.homework1;

import lesson3.homework1.cats.Cat;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Cat barsik = CatFactory.createCat("Barsik");
        Cat mursik = CatFactory.createCat("Mursik");

        Predicate<Cat> predicate = x -> x.getName().equals("Mursik");
        System.out.println(predicate.test(barsik));
        System.out.println(predicate.test(mursik));
        BiPredicate<Cat, Cat> biPredicate = (x, y) -> x.getName().equals(y.getName());
        System.out.println(biPredicate.test(barsik, mursik));

        BinaryOperator<Cat> binaryOperator = (x, y) -> {
            x.setAge(y.getAge());
            return x;
        };
        System.out.println(binaryOperator.apply(barsik, mursik).getAge());

        UnaryOperator<Cat> unaryOperator = x -> {
            x.setAge(1);
            return x;
        };
        System.out.println(unaryOperator.apply(barsik).getAge());

        Function<Cat, String> function = x -> x.isHerbivore() ? "Yes" : "No";
        System.out.println(function.apply(barsik));
        BiFunction<Cat,Cat, String> biFunction = (x, y) -> (x.isHerbivore() & y.isHerbivore()) ? "Yes": "No";

        Consumer<Cat> consumer = x -> x.setHerbivore(false);
        consumer.accept(barsik);
        System.out.println(barsik.isHerbivore());
        BiConsumer<Cat, Cat> biConsumer = (x, y) -> x.setAge(y.getAge());
        biConsumer.accept(barsik, mursik);
        System.out.println(barsik.getAge());

        Supplier supplier = () -> barsik.getName();
        System.out.println(supplier.get());
    }
}

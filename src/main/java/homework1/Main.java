package homework1;

import homework1.cats.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat mursik = catFactory.createCat("Mursik");
        Cat barsik = catFactory.createCat("Barsik");

        Supplier<String> supplier = () -> barsik.getName();
        System.out.println(supplier.get());

        Consumer<Cat> consumer = b -> System.out.println(b.isHungry());
        consumer.accept(barsik);
        Map<String, Integer> catMap = new HashMap<>();
        BiConsumer<Cat, Cat> biConsumer = (c1, c2) -> catMap.put(c1.getName(), c2.getAge());
        biConsumer.accept(barsik, mursik);

        Predicate<Cat> predicate = O -> O.isHungry();
        System.out.println(predicate.test(barsik));
        BiPredicate<Cat, String> biPredicate = (O, s) -> s.equalsIgnoreCase(O.getName());
        System.out.println(biPredicate.test(mursik, "mursik"));

        Function<Cat, String> function = p -> p.isHungry() ? "Hungry" : "Not hungry";
        System.out.println(function.apply(mursik));
        BiFunction<Cat, Cat, String> biFunction = (c1, c2) -> c1.getName().concat(c2.getName());
        System.out.println(biFunction.apply(barsik, mursik));

        UnaryOperator<Cat> unaryOperator = c -> {
            c.setHungry(false);
            return c;
        };
        unaryOperator.apply(mursik);

        BinaryOperator<Cat> binaryOperator = (c1, c2) -> {
            c1.setAge(c2.getAge() + 1);
            return c1;
        };
        binaryOperator.apply(barsik, mursik);
    }
}

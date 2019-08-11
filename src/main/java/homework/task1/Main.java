package homework.task1;

import homework.task1.cats.Cat;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        CatFabric fabric = new CatFabric();
        Cat john = fabric.createCat("john");
        Cat rick = fabric.createCat("rick");


        Supplier<String> supplier = () -> john.getName();
        System.out.println("Supplier example: " + supplier.get());

        Consumer<Cat> consumer = cat -> System.out.println(cat.getName() + " hungry? - " + cat.isHungry());
        consumer.accept(rick);
        BiConsumer<Cat, Boolean> biConsumer = (x, z) -> x.setHungry(z);
        biConsumer.accept(rick,true);
        consumer.accept(rick);

        Predicate<Cat> predicate = o -> o.isHungry();
        System.out.println("Predicate example: " + predicate.test(john));
        BiPredicate<Cat, String> biPredicate = (x, z) -> x.getName().equalsIgnoreCase(z);
        System.out.println("John hungry? " + biPredicate.test(john, "dalton"));

        Function<Cat, String> function = cat -> {
            if (cat.isHungry()) {
                return "I want to eat";
            } else {
                return "Full";
            }
        };
        System.out.println("Function example: " + function.apply(john));
        BiFunction<Cat, Cat, String> biFunction = (j, r) -> j.getName().concat(r.getName());
        System.out.println("BiFunction example: " + biFunction.apply(john, rick));

        UnaryOperator<String> unaryOperator = cat -> cat.toUpperCase();
        System.out.println("UnaryOperator example: " + unaryOperator.apply(john.getName()));

        BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
        System.out.println("BinaryOperator example: " + binaryOperator.apply(rick.getName(), john.getName()));
    }
}

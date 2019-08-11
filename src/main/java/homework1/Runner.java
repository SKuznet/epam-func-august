package homework1;

import java.util.function.*;

/**
 * Реализовать фабричный метод по созданию котов (паттерн) и в методе мейн,
 * через фабрику создав кота/котов на нем использовать все типы функциональных интерфейсов, что мы прошли.
 */
public class Runner {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat cat1 = catFactory.createCat("Abyssinian", "Alex", true, false);
        Cat cat2 = catFactory.createCat("Sphynx", "Riska", true, false);
        System.out.println(cat1);
        System.out.println(cat2);

        Predicate<Cat> predicate = a -> a.isHerbivore();
        System.out.println("Is cat1 herbivore? - " + predicate.test(cat1));

        BiPredicate<Cat, Cat> biPredicate = (a, b) -> a.isHerbivore() && b.isHungry();
        System.out.println("Is both cat1 herbivore and cat2 hungry? - " + biPredicate.test(cat2, cat2));

        Consumer<Cat> consumer = a -> a.setHerbivore(true);
        consumer.accept(cat2);
        System.out.println("Changed cat2 herbivore parameter to " + cat2.isHerbivore());

        BiConsumer<Cat, Cat> biConsumer = (a,b) -> System.out.println("Hunger: " + a.isHungry() + " " + b.isHungry());
        biConsumer.accept(cat1, cat2);

        Supplier<Cat> supplier = () -> cat1;
        System.out.println("Return cat with supplier: " + supplier.get());

        Function<Cat, String> function = a -> a.getName() + " the cat";
        System.out.println("Full name of cat1 " + function.apply(cat1));

        BiFunction<Cat, Cat, String> biFunction = (a, b) -> a.getName() + " " + b.getName();
        System.out.println("Cat names are: " + biFunction.apply(cat1, cat2));

        UnaryOperator<Cat> operator = a -> {
            a.setHungry(true);
            return a;
        };
        System.out.println("Cat1 with changed behavior " + operator.apply(cat1));

        BinaryOperator<Cat> binaryOperator = (a, b) -> {
            a.setHungry(b.isHungry());
            return a;
        };
        System.out.println("Cat1 is now as hungry as cat2 " + binaryOperator.apply(cat1, cat2));
    }
}

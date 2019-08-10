package homework1;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        FabricOfCat<Cat> fabricOfCat = () -> new Cat();
        Supplier<Cat> supplier = () -> fabricOfCat.createCate();
        Cat cat = supplier.get();

        BiConsumer<String, Boolean> biConsumer = (name, isHungry) -> {
            cat.setName(name);
            cat.setHungry(isHungry);
        };
        biConsumer.accept("Barsik", true);

        Consumer<Boolean> consumer = isHerbivore -> cat.setHerbivore(isHerbivore);
        consumer.accept(true);

        Predicate<Cat> predicate = x -> x.isHungry();
        if (predicate.test(cat)) {
            System.out.println(cat);
        }

        UnaryOperator<Cat> unaryOperator = x -> {
            x.setName(x.getName().concat(" is always hungry"));
            return x;
        };
        unaryOperator.apply(cat);
        System.out.println(cat);

        BinaryOperator<String> binaryOperator = (firstName, lastName) -> {
            cat.setName(firstName + " " + lastName);
            return cat.getName();
        };
        binaryOperator.apply("Barsik", "Ivanov");
        System.out.println(cat);

        BiPredicate<Cat, Integer> biPredicate = (x, lengthOfGoodName) -> x.getName().length() > lengthOfGoodName;
        if (biPredicate.test(cat, 9)) {
            System.out.println("the best name is " + cat);
        }

        Function<Cat, String> function = x -> x.getName() + " herbivore? " + x.isHerbivore();
        System.out.println(function.apply(cat));

        BiFunction<Cat, Boolean, String> biFunction = (x, isHerbivore) -> {
            x.setHerbivore(isHerbivore);
            return x.getName() + " herbivore? " + x.isHerbivore();
        };
        System.out.println(biFunction.apply(cat, false));
    }
}

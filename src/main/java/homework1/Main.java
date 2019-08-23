package homework1;

import homework1.Cats.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat boris = catFactory.createCat("Boris");
        Cat vasilii = catFactory.createCat("Vasilii");

        Function<Cat, String> function = p -> p.isHerbivore() ? p.getName() + " : I'm vegan!" : p.getName() + " : I love meat!";
        BiFunction<Cat, String, String> biFunction = (c1, c2) -> c1.getName().concat(c2);

        System.out.println(function.apply(boris));
        System.out.println(biFunction.apply(vasilii, " good"));

        Consumer<Cat> consumer = c -> System.out.println(c.isHungry());

        Map<String, Boolean> catMap = new HashMap<>();
        BiConsumer<Cat, Cat> biConsumer = (c1, c2) -> catMap.put(c1.getName(), c2.isHungry());

        consumer.accept(vasilii);
        biConsumer.accept(boris, vasilii);

        UnaryOperator<Cat> unaryOperator = c -> {
            c.setName(c.getName().concat(" II"));
            return c;
        };
        System.out.println(unaryOperator.apply(boris).getName());

        BinaryOperator<Cat> binaryOperator = (c1, c2) -> {
            c1.setColor(c2.getColor().concat(c1.getColor()));
            return c1;
        };
        System.out.println(binaryOperator.apply(vasilii, boris).getColor());

        Supplier<String> supplier = () -> vasilii.getName();
        System.out.println(supplier.get());

        Predicate<Cat> predicate = O -> O.isHerbivore();
        System.out.println(predicate.test(vasilii));
        BiPredicate<Cat, String> biPredicate = (O, s) -> s.equalsIgnoreCase(O.getName());
        System.out.println(biPredicate.test(boris, "boris ii"));
    }
}

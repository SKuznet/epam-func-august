package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Start {
    public static void main(String[] args) {
        CatFactory factory = new CatFactory();
        Cat oscar = factory.createCat("Oscar", "Maine Coon", 5, 6, "Anna");
        Cat max = factory.createCat("Max", "Russian Blue", 3, 2, "Kate");
        Cat cleo = factory.createCat("Cleo", "Siamese", 4, 1, "Bob");

        Supplier<Cat[]> supplier = () -> new Cat[]{max, cleo};
        System.out.println(Arrays.toString(supplier.get()));

        List<Cat> cats = new ArrayList<>();
        Consumer<Cat> consumer = c -> cats.add(c);
        consumer.accept(oscar);
        System.out.println(cats);

        BiConsumer<Cat, Cat> biConsumer = (a, b) -> System.out.println(a.getName() + " " + b.getName());
        biConsumer.accept(max, cleo);

        Predicate<Cat> predicate = a -> a.getWeight() < 3;
        System.out.println(predicate.test(oscar));

        BiPredicate<Cat, Cat> biPredicate = (f, g) -> f.meow().equals(g.meow());
        System.out.println(biPredicate.test(oscar, max));

        Function<Cat, Integer> function = h -> h.getAge();
        System.out.println(function.apply(cleo));

        BiFunction<Cat, Cat, String> biFunction = (k, l) -> l.getOwnerName().concat(k.getOwnerName());
        System.out.println(biFunction.apply(oscar, max));

        UnaryOperator<Cat> unaryOperator = p -> {
            p.setWeight(p.getWeight() + 5);
            return p;
        };
        System.out.println(unaryOperator.apply(max));

        BinaryOperator<Cat> binaryOperator = (m, n) -> {
            n.setAge(m.getAge() + n.getAge());
            return n;
        };
        System.out.println(binaryOperator.apply(max, cleo));
    }
}

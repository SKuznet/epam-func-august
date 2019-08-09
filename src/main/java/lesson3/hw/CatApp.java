package lesson3.hw;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import lesson3.hw.Cat.God;

public class CatApp {

  public static void main(String[] args) {
    Cat barsik = God.createCat("Barsik", 50, 10, true);
    Cat sharik = God.createCat("Sharik", 55, 15, false);

    //consumer
    Consumer<Cat> consumer = (c -> System.out.println(c.getName()));
    consumer.accept(barsik);
    BiConsumer<Cat, Cat> biConsumer = ((c1, c2) -> System.out
        .println(c1.getHeight() + c2.getWeight()));
    biConsumer.accept(barsik, barsik);

    //function
    Function<Cat, Integer> function = (c -> (c.getHeight() - c.getWeight() * 10 / 2 + 332));
    System.out.println(function.apply(sharik));
    BiFunction<Cat, Cat, String> biFunction = ((c1, c2) -> c1.getName().concat(c2.getName()));
    System.out.println(biFunction.apply(barsik, sharik));

    //operator
    UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
    System.out.println(unaryOperator.apply(barsik.getName()));
    BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
    System.out.println(binaryOperator.apply(barsik.getName(), sharik.getName()));

    //predicate
    Predicate<Cat> predicate = c -> c.isAlive();
    System.out.println(predicate.test(barsik));
    BiPredicate<Cat, Cat> biPredicate = (c1, c2) -> c1.getName().equalsIgnoreCase(c2.getName());
    System.out.println(biPredicate.test(barsik, sharik));

    //supplier
    Supplier<String> supplier = () -> "Cat name is " + barsik.getName();
    System.out.println(supplier.get());
  }
}

package hw1;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Cat barsik = (Cat) new CatFactory().animalCreator();
        Cat laika = (Cat) new DogFactory().animalCreator();
    }
    // Consumer example.
    Consumer<Animal> animalConsumer = animal -> animal.run();
        animalConsumer.accept(barsik);
        animalConsumer.accept(laika);

    // Function example.
    Function<Animal, String> animalFunction =  -> animal.toString();
        System.out.println(animalFunction.apply(barsik));

    // BiFunction example.
    BiFunction<Animal, Animal, String> biFunction = (animal, animal2) -> animal.run() + " and " + animal2.run();
        System.out.println(biFunction.apply(barsik, laika));

    // Operator example.
    UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply(laika.run()));

    // Predicate example.
    Predicate<Animal> predicate = animal -> animal.run().equals("Meow");
        if (predicate.test(laika)) {
        System.out.println("It's laika!");
    } else {

        System.out.println("It's not a laika.");
    }
}
}

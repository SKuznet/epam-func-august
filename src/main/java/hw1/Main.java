package hw1;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new CatFactory().animalCreator();
        Animal laika = new DogFactory().animalCreator();

        // Consumer example.
        Consumer<Animal> animalConsumer = animal -> animal.run();
        animalConsumer.accept(barsik);
        animalConsumer.accept(laika);

        // Function example.
        Function<Animal, String> animalFunction = animal -> animal.toString();
        System.out.println(animalFunction.apply(barsik));

        // BiFunction example.
        BiFunction<Animal, Animal, Integer> biFunction = (animal, animal2) -> animal.legs() + animal2.legs();
        System.out.println("Obshee kol-vo lap" + biFunction.apply(barsik, laika));

        // Operator example.
        UnaryOperator<Integer> unaryOperator = s -> s.intValue();
        System.out.println(unaryOperator.apply(laika.legs()));

        // Predicate example.
        Predicate<Animal> predicate = animal -> animal.legs() == 5;
        if (predicate.test(laika)) {
            System.out.println("It's laika!");
        } else {

            System.out.println("It's not a laika.");
        }
    }
}

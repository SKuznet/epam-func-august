package hw1;

import lesson2.cats.Cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        CatGenerator catGenerator = new CatGenerator();
        Consumer<String> print = x -> System.out.println(x); //For the glory of Satan \o/

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            //Supplier
            Supplier<Cat> commonCat = () -> catGenerator.getCat();

            System.out.print("Input first cat name: ");
            String catName = reader.readLine();
            Cat firstCat = catName.equals("") ? commonCat.get() : catGenerator.getCat(catName);
            System.out.print("Input second cat name: ");
            catName = reader.readLine();
            Cat secondCat = catName.equals("") ? commonCat.get() : catGenerator.getCat(catName);

            //Function interface
            print.accept("Function example:");
            Function<Cat, String> catToString = x -> "A cat named " + x.getName() +
                    (x.isHerbivore() ? " is herbivore" : " is carnivorous") + " and " +
                    (x.isHungry() ? "hungry" : "not hungry");
            print.accept(catToString.apply(firstCat) + "\n");

            //Consumer interface
            print.accept("Consumer example:");
            Consumer<Cat> printCat = x -> print.accept(catToString.apply(x) + "\n");
            printCat.accept(firstCat);

            //UnaryOperator interface
            print.accept("UnaryOperator example:");
            UnaryOperator<Cat> invertCat = x -> {
                x.setHerbivore(!x.isHerbivore());
                x.setHungry(!x.isHungry());
                return x;
            };
            printCat.accept(invertCat.apply(firstCat));

            //BiFunction interface
            print.accept("BiFunction example:");
            BiFunction<Cat, Boolean, String> verifyCatInvert = (x, y) -> {
                if (y) {
                    x = invertCat.apply(x);
                }
                return catToString.apply(x);
            };
            print.accept(verifyCatInvert.apply(firstCat, true) + "\n");

            //BiConsumer interface
            print.accept("BiConsumer example:");
            BiConsumer<Cat, CatGenerator> biConsumer = (x, y) -> {
                Cat catPushok = commonCat.get();
                x.setName(catPushok.getName());
                x.setHerbivore(catPushok.isHerbivore());
                x.setHungry(catPushok.isHungry());
            };
            biConsumer.accept(firstCat, catGenerator);
            printCat.accept(firstCat);

            //BinaryOperator interface
            print.accept("BinaryOperator example:");
            BinaryOperator<Cat> catConcat = (x, y) -> {
                Cat victim = commonCat.get();
                victim.setName(x.getName() + y.getName());
                victim.setHerbivore(x.isHerbivore() | y.isHerbivore());
                victim.setHungry(x.isHungry() | y.isHungry());
                return victim;
            };
            printCat.accept(catConcat.apply(firstCat, secondCat));

            //Predicate interface
            print.accept("Predicate example:");
            Predicate<Cat> isHungry = x -> x.isHungry();
            print.accept("A cat " + firstCat.getName() + (isHungry.test(firstCat) ? " is hungry" : " isn't hungry") + "\n");

            //BiPredicate interface
            print.accept("BiPredicate example:");
            BiPredicate<Cat, String> hasName = (x, y) -> x.getName().equals(y);
            String exampleName = "Murzik";
            print.accept("A cat " + secondCat.getName() + " has name " + exampleName + ": " + hasName.test(secondCat, exampleName) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package homeworks;

import java.util.function.*;

/**
 * Homework 1: this homework shows usage of embedded functional interfaces in Java 8.
 * Your task is make a class Cat, class using factory method to produce cats, the Main class with operating with cats.
 * All operation must be described with functional interfaces such as: Supplier, Predicate, Function etc).
 */
public class CatExecutor {
    public static void main(String[] args) {
        CatFabric fabric = new CatFabric();
        Cat murzik = fabric.create("Murzik", "Male", 4);
        Cat barsik = fabric.create("Barsik", "Male", 10);
        Cat riska = fabric.create("Riska", "Female", 5);

        printInfo(barsik);
        crowning(riska);
        System.out.println(clone(murzik, 3));
        happyBirthday(barsik);
        System.out.println(setStatus(riska, "eating"));
        System.out.println(isOld(barsik));
        System.out.println(isFamily(murzik, barsik));
    }

    /**
     * Method using Consumer<T> interface
     */
    public static void printInfo(Cat cat) {
        Consumer<Cat> consumer = System.out::println;
        consumer.accept(cat);
    }

    /**
     * Method using Function<T, R> interface
     */
    public static void crowning(Cat cat) {
        Function<Cat, String> function = (myCat) -> {
            StringBuilder maleTitle = new StringBuilder("King ");
            StringBuilder femaleTitle = new StringBuilder("Queen ");

            if (cat.getSex().equalsIgnoreCase("Male")) {
                return String.valueOf(maleTitle.append(cat.getName()));
            } else if (cat.getSex().equalsIgnoreCase("Female")) {
                return String.valueOf(femaleTitle.append(cat.getName()));
            }
            return "Another gender?";
        };
        System.out.println(function.apply(cat));
    }

    /**
     * Method using BiFunction<T, U, R> interface
     */
    public static StringBuilder clone(Cat cat, Integer quantity) {
        StringBuilder result = new StringBuilder("See how many cats here: ");
        BiFunction<Integer, Cat, StringBuilder> function = (number, cat1) -> {
            StringBuilder manyCats = new StringBuilder();
            for (int i = 0; i < number; i++) {
                manyCats.append(" ").append(cat1.getName());
            }
            return manyCats;
        };
        return result.append(function.apply(quantity, cat));
    }

    /**
     * Method using UnaryOperator<T> interface
     */
    public static void happyBirthday(Cat cat) {
        System.out.println("Happy Birthday, " + cat.getName() + "! Now you're " + increaseAge(cat));
    }

    public static Integer increaseAge(Cat cat) {
        UnaryOperator<Integer> unaryOperator = (age) -> age += 1;
        return unaryOperator.apply(cat.getAge());
    }

    /**
     * Method using BinaryOperator<T> interface
     */
    public static String setStatus(Cat cat, String status) {
        String result = cat.getName() + "'s ";
        BinaryOperator<String> binaryOperator = String::concat;
        return binaryOperator.apply(result, status);
    }

    /**
     * Method using Predicate<T> interface
     */
    public static String isOld(Cat cat) {
        Predicate<Cat> predicate = (myCat) -> myCat.getAge() > 10;
        if (predicate.test(cat)) {
            return cat.getName() + " is old.";
        } else {
            return cat.getName() + " not so old";
        }
    }

    /**
     * Method using BiPredicate<T, U> interface
     */
    public static StringBuilder isFamily(Cat cat, Cat kitty) {
        StringBuilder result = new StringBuilder(cat.getName() + " and " + kitty.getName() + " is a family: ");
        BiPredicate<String, String> biPredicate = ((catSex1, catSex2) -> catSex1 != catSex2);
        result.append(biPredicate.test(cat.getSex(), kitty.getSex()));
        return result;
    }
}

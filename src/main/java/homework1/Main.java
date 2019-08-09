package homework1;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Cat murka = CatFactory.createCat("Murka", "red", 5, "Fish");
        Cat bars = CatFactory.createCat("Bars", "white", 9, "Truffles");
        Cat tarakanische = CatFactory.createCat("Tarakanische");

        Function<Cat, String> catToString = cat -> cat.toString();
        System.out.println(catToString.apply(murka));
        System.out.println("____________________________\n");

        BiFunction<Cat, Cat, Integer> ageDifference = (cat1, cat2) -> Math.abs(cat1.getAge() - cat2.getAge());
        System.out.println("Age difference is " + ageDifference.apply(bars, murka));
        System.out.println("____________________________\n");

        Consumer<Cat> happyBirthday = cat -> cat.setAge(cat.getAge() + 1);
        System.out.println(murka);
        happyBirthday.accept(murka);
        System.out.println("Now older " + murka);
        System.out.println("____________________________\n");


        BiConsumer<Cat, String> groomer = (cat, newColor) -> cat.setColor(newColor);
        System.out.println(bars);
        groomer.accept(bars, "black");
        System.out.println("Now colored " + bars);
        System.out.println("____________________________\n");

        UnaryOperator<Cat> shout = cat -> {
            cat.setName(cat.getName().toUpperCase());
            return cat;
        };
        System.out.println("Let's shout " + shout.apply(tarakanische));
        System.out.println("____________________________\n");


        BinaryOperator<Cat> kitten = (cat1, cat2) -> {
            return CatFactory.createCat("Kotya", cat1.getColor() + "-" + cat2.getColor(), 0, "Milk");
        };
        System.out.println("New born kitten " + kitten.apply(bars, murka));
        System.out.println("____________________________\n");


        Predicate<Cat> isVegan = cat -> {
            return cat.getFavoriteFood().equalsIgnoreCase("Vegetables");
        };
        System.out.println(murka);
        System.out.println("Is " + murka.getName() + " vegan? " + isVegan.test(murka));
        System.out.println("____________________________\n");


        BiPredicate<Cat, Cat> oneColor = (cat1, cat2) -> {
            return cat1.getColor().equalsIgnoreCase(cat2.getColor());
        };
        System.out.println("Do " + murka.getName() + " and " + bars.getName() + " have one color? " + oneColor.test(murka, bars));
        System.out.println("____________________________\n");

        Supplier<Cat> foundCat = () -> tarakanische;
        System.out.println("You have found a cat: " + foundCat.get());
    }
}

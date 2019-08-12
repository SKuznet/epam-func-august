package hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

  public static void main(String[] args) {
    Cat octoCat = CatFactory.create("Octocat");
    Cat catOctopus = CatFactory.create("Catoctopus");

    Function<Cat, Integer> function = s -> s.getName().length();
    System.out.println("Function cat length = " + function.apply(octoCat));

    BiFunction<Cat, Cat, Integer> biFunction = (s1, s2) -> s1.getName().length() + s2.getName()
        .length();
    System.out.println("BiFunction 2 cats length = " + biFunction.apply(octoCat, catOctopus));

    UnaryOperator<Cat> unaryOperator = Cat::antiCat;
    System.out.println("UnaryOperator cat = " + catOctopus.getName() + " anticat = " + unaryOperator
        .apply(catOctopus).getName());

    BinaryOperator<Cat> binaryOperator = Cat::catMerge;
    System.out.println("BinaryOperator cat merge : " + binaryOperator.apply(octoCat, catOctopus).getName());

    Predicate<Cat> predicate = Cat::hasName;
    Cat cat = new Cat("");
    System.out.println("Predicate " + (predicate.test(cat) ? "This cat has no name"
        : "Cat's name is " + cat.getName()));

    BiPredicate<Cat, Cat> biPredicate = Object::equals;
    System.out.println("BiPredicate "+(biPredicate.test(catOctopus,octoCat)?"equal":"not equal"));

    Supplier<Cat> supplier = ()->octoCat;
    System.out.println("Supplier get cat name "+supplier.get().getName());

    List<Cat> catHome = new ArrayList<>();
    Consumer<Cat> consumer = catHome::add;
    consumer.accept(octoCat);
    consumer.accept(catOctopus);
    System.out.println("Consumer "+ catHome.size()+" cats in the home ");
  }

}

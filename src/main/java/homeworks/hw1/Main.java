package homeworks.hw1;

import homeworks.hw1.cats.Cat;
import homeworks.hw1.cats.CatDelivery;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    static List<Cat> catList = new ArrayList<>();
    static int count = 0;


    public static void main(String[] args) {
        catList = CatDelivery.getCats();

        Consumer<Cat> consumer = s -> System.out.println("I'm a " + s.getClass().getSimpleName());
        consumer.accept(catList.get(count++));

        Function<Cat, String> function = s -> s.getClass().getSimpleName() + ": " + s.makeAction();
        System.out.println(function.apply(catList.get(count++)));

        UnaryOperator<StringBuilder> operator = s -> s.reverse().append(". Try to understand.=)");
        System.out.println(operator.apply(new StringBuilder(catList.get(count++).makeAction())));

        Predicate<Cat> predicate = s -> s.getClass().getSimpleName().equalsIgnoreCase("Puma");
        if(predicate.test(catList.get(count++))){
            System.out.println("Sleeping on the tree.");
        } else {
            System.out.println("Sleeping on the ground.");
        }

        Supplier<Cat> supplier = ()-> new CatFactory().getCat("toycat");
        supplier.get().makeVoice();
    }
}

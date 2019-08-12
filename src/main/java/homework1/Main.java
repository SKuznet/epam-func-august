package homework1;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        // Supplier example.
        CatFactory catFactory = new CatFactory();
        Cat barsik = catFactory.createCat("Barsik");
        Cat murzik = catFactory.createCat("Mursik");
        
        // Consumer example.
        Consumer<Cat> catConsumer = cat -> cat.sayMeow();
        catConsumer.accept(barsik);
        catConsumer.accept(murzik);
        
        // Function example.
        Function<Cat, String> catFunction = cat -> cat.toString();
        System.out.println(catFunction.apply(barsik));
        
        // BiFunction example.
        BiFunction<Cat, Cat, String> biFunction = (cat, cat2) -> cat.getMeow() + " and " + cat2.getMeow();
        System.out.println(biFunction.apply(barsik, murzik));
        
        // Operator example.
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply(murzik.getMeow()));
        
        // Predicate example.
        Predicate<Cat> predicate = cat -> cat.getMeow().equals("Meow from Murzik!");
        if (predicate.test(murzik)) {
            System.out.println("It's murzik!");
        } else {
            System.out.println("It's not a murzik.");
        }
    }
}

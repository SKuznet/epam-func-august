package HomeWorcks.hw1;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Cat barsik = CatFactory.getCat("Barsik");
        Cat murzik = CatFactory.getCat("Murzik");
        Cat simon = CatFactory.getCat("Simon");

        //Consumer
        Consumer<Cat> consumer = s -> System.out.println("I'm a " + s.getClass().getSimpleName());
        consumer.accept(simon);

        //Function
        Function<Cat, String> function = s -> s.getClass().getSimpleName() + ": " + s.name();
        System.out.println(function.apply(murzik));

        //UnaryOperator
        UnaryOperator<StringBuilder> operator = s -> s.reverse().append(" | Murzik");
        System.out.println(operator.apply(new StringBuilder(murzik.name())));

        //Predicate
        Predicate<Cat> predicate = s -> s.getClass().getSimpleName().equalsIgnoreCase("Barsik");
        if(predicate.test(barsik)){
            System.out.println("Barsik is street cat.");
        } else {
            System.out.println("Is home cate.");
        }

        //Supplier
        Supplier<Cat> supplier = ()-> new CatFactory().getCat("cat");
        supplier.get().sayName();
    }
}

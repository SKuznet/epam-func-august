package HomeWork1;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Cat pushok = CatFactory.getCat("barsik");
        Cat rizhik = CatFactory.getCat("Rizhik");

        Function<String, Cat>  function = s->CatFactory.getCat(s);
        System.out.println(function.apply("Barsik"));

        BiFunction<String, String, Boolean> biFunction = (s1, s2)-> CatFactory.getCat(s1).equals(CatFactory.getCat(s2));
        System.out.println(biFunction.apply("Barsik", "Murzik"));

        Predicate<Cat> predicate = b -> b.equals(pushok);
        System.out.println(predicate.test(rizhik));

        BiPredicate<Cat, Cat> biPredicate = (a,b) -> a.equals(b);
        System.out.println(biPredicate.test(pushok, rizhik));

        UnaryOperator<String> unaryOperator = a -> CatFactory.getCat(a).getName().toUpperCase();
        System.out.println("UnaryOperator: " + unaryOperator.apply("Barsik"));

        BinaryOperator<String> binaryOperator = (a,b)-> CatFactory.getCat(a).getName() + " and " + CatFactory.getCat(b).getName();
        System.out.println(binaryOperator.apply("Barsik", "Mursik"));

        Consumer<String> consumer = s-> System.out.println(CatFactory.getCat(s));
        consumer.accept("Pushistiy");

        Supplier<Cat> supplier= ()-> CatFactory.getCat("Murzik");
        System.out.println(supplier.get());
    }
}

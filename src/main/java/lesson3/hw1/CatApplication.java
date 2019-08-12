package lesson3.hw1;

import java.util.function.*;

public class CatApplication {

    public static void main(String[] args) {
        CatFactory factory = new CatFactory();

        Cat abyssinian = factory.getCat(CatBreeds.ABYSSINIAN);
        Cat balinese = factory.getCat(CatBreeds.BALINESE);
        Cat ocicat = factory.getCat(CatBreeds.OCICAT);

        //consumer functional interface
        Consumer<Cat> consumer = (c -> System.out.println(c.getName()));
        consumer.accept(abyssinian);

        BiConsumer<Cat, Cat> biConsumer = ((c1, c2) -> System.out
                .println(c1.getCountry() + c2.getCountry()));
        biConsumer.accept(ocicat, balinese);

        //function functional interface
        Function<Cat, String> catStringFunction = cat -> cat.toString();
        System.out.println(catStringFunction.apply(abyssinian));
        System.out.println(catStringFunction.apply(balinese));

        BiFunction<Cat, Cat, String> catStringBiFunction = (cat1, cat2) -> cat1.toString().concat(cat2.toString());
        System.out.println(catStringBiFunction.apply(abyssinian, balinese));

        //operator functional interface
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply(balinese.getName()));

        BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
        System.out.println(binaryOperator.apply(balinese.getName(), ocicat.getName()));

        //predicate functional interface
        Predicate<Cat> predicate = c -> c.isAlive();
        System.out.println(predicate.test(ocicat));

        BiPredicate<Cat, Cat> biPredicate = (c1, c2) -> c1.getName().equalsIgnoreCase(c2.getName());
        System.out.println(biPredicate.test(ocicat, balinese));

        //supplier functional interface
        Supplier<String> supplier = () -> "Cat name is " + abyssinian.getName();
        System.out.println(supplier.get());
    }
}

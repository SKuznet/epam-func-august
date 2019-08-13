package HW1;

import java.util.function.*;

public class Main1 {
    public  static void main(String[] args){
        CatFactory siamCatFactory = new SiamCatFactory();
        CatFactory britishCatFactory = new BritishCatFactory();

        SiamCat siam_cat = (SiamCat)siamCatFactory.create();
        BritishCat british_cat = (BritishCat) britishCatFactory.create();

        siam_cat.sayHello();
        british_cat.sayHello();
        siam_cat.setName("Barsik");
        british_cat.setName("Murzik");
        siam_cat.setAfraidOfDogs(true);
        british_cat.setAfraidOfDogs(false);

        //Functional interfaces
        Predicate<Cat> predicate = O -> O.getName().equals("Barsik");
        System.out.println("Predicate result = " + predicate.test(siam_cat));

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println("BiPredicate result = " + biPredicate.test(siam_cat.getName(), british_cat.getName()));

        Function<String, String> function1 = s -> s.substring(0, s.length()/4);
        System.out.println("Function result = " + function1.apply(siam_cat.getClass().toString()));

        BiFunction<Boolean, Boolean, Boolean> biFunction = (s1, s2) -> s1 ^ s2;
        System.out.println("BiFunction result = " + biFunction.apply(siam_cat.isAfraidOfDogs(), british_cat.isAfraidOfDogs()));

        Consumer<Boolean> consumer = s -> System.out.println("Consumer result = " + s.toString().toUpperCase());
        consumer.accept(siam_cat.isAfraidOfDogs());

        BiConsumer<String, String> biConsumer = ((s1, s2) -> System.out.println("BiConsumer result = " + s1.concat(s2)));
        biConsumer.accept("Cat's name is ", siam_cat.getName());

        Supplier<String> supplier = () -> (british_cat.getName().replaceAll("zik", ""));
        System.out.println("Supplier result = " + (supplier.get()));

        UnaryOperator<Boolean> unaryOperator = s -> !s;
        System.out.println("UnaryOperator result = " + unaryOperator.apply(british_cat.isAfraidOfDogs()));

        BinaryOperator<Boolean> binaryOperator = (s1, s2) -> s1 == s2;
        System.out.println("BinaryOperator result = " + binaryOperator.apply(british_cat.isAfraidOfDogs(), siam_cat.isAfraidOfDogs()));
    }
}

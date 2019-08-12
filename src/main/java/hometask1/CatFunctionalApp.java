package hometask1;

import hometask1.cats.AbstractCat;

import java.util.Arrays;
import java.util.function.*;

public class CatFunctionalApp {
    private static CatFabric catFabric;
    private static final String[] moodList = {"happy", "freshman", "rude"};

    public CatFunctionalApp() {
        catFabric = new CatFabric();
    }

    public static void main(String[] args) {
        CatFunctionalApp catFunctionalApp = new CatFunctionalApp();

        for (String mood : moodList) {
            System.out.println(mood + " cat functional operations----------------------------");
            catFunctionalApp.consumerExample(mood);
            catFunctionalApp.functionExample(mood);
            catFunctionalApp.operatorExample(mood);
            catFunctionalApp.predicateExample(mood);
            catFunctionalApp.supplierExample(mood);
        }
    }


    private boolean consumerExample(String mood) {
        Consumer<AbstractCat> consumer = cat -> System.out.println(cat.sayHi());
        consumer.accept(catFabric.getAbstractCat(mood));

        BiConsumer<AbstractCat, AbstractCat> biConsumer = (c1, c2) -> System.out.println(c1.sayHi() + c2.sayBye());
        biConsumer.accept(catFabric.getAbstractCat(mood), catFabric.getAbstractCat(mood));
        return true;
    }

    private boolean functionExample(String mood) {
        Function<AbstractCat, String> function = cat -> cat.sayHi();
        System.out.println(function.apply(catFabric.getAbstractCat(mood)));

        Function<AbstractCat, Integer> function1 = cat -> cat.sayBye().length();
        System.out.println(function1.apply(catFabric.getAbstractCat(mood)));

        BiFunction<AbstractCat, AbstractCat, String> biFunction = (c1, c2) -> c1.sayHi() + c2.sayBye();
        biFunction.apply(catFabric.getAbstractCat(mood), catFabric.getAbstractCat(mood));
        return true;

    }

    private boolean operatorExample(String mood) {
        UnaryOperator<String> unaryOperator = message -> message.toUpperCase();
        System.out.println(unaryOperator.apply(catFabric.getAbstractCat(mood).toString()));

        BinaryOperator<String> binaryOperator = (sb1, sb2) -> sb1.concat(" " + sb2);
        System.out.println(binaryOperator.apply(catFabric.getAbstractCat(mood).sayHi(), catFabric.getAbstractCat(mood).sayBye()));
        return true;
    }

    private boolean predicateExample(String mood) {
        Predicate<AbstractCat> predicate = cat -> cat.sayHi().length() > 8;
        System.out.println(predicate.test(catFabric.getAbstractCat(mood)));

        BiPredicate<AbstractCat, AbstractCat> biPredicate = (c1, c2) -> c1.sayHi().length() > c2.sayBye().length();
        System.out.println(biPredicate.test(catFabric.getAbstractCat(mood), catFabric.getAbstractCat(mood)));
        return true;
    }

    private boolean supplierExample(String mood) {
        Supplier<AbstractCat> supplier = () -> catFabric.getAbstractCat(mood);
        System.out.println(supplier.get().toString());

        Supplier<String[]> supplier1 = () -> new String[]{catFabric.getAbstractCat(mood).sayHi(),
                catFabric.getAbstractCat(mood).sayBye()};
        System.out.println(Arrays.toString(supplier1.get()));
        return true;
    }

}

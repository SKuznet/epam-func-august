package homework1;

import homework1.AbstractCatFactory.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        CatFactory baldCatFactory = new BaldCatFactory();
        CatFactory hairyCatFactory = new HairyCatFactory();

        Cat brownBaldyCat = new Cat("BrownBaldyBarsik", baldCatFactory, Color.BROWN);
        Cat whiteBaldyCat = new Cat("WhiteBaldyMurzik", baldCatFactory, Color.WHITE);
        Cat defaultHairyCat = new Cat("DefaultHairySharik", hairyCatFactory, Color.NONE);
        Cat brownHairyCat = new Cat("BrownHairySharfik", hairyCatFactory, Color.BROWN);

        // equals cats
        System.out.println("\nBiConsumer");
        BiConsumer<Cat, Cat> biConsumer = (cat1, cat2) -> {

            System.out.println("BiConsumer cats equals: " + (cat1.equals(cat2)));
        };
        biConsumer.accept(brownBaldyCat, whiteBaldyCat);
        biConsumer.accept(brownHairyCat, defaultHairyCat);
        biConsumer.accept(brownHairyCat, brownBaldyCat);
        biConsumer.accept(brownHairyCat, brownHairyCat);

        // put elements to map only if value length greater than 3
        Map<String, String> map = new HashMap<>();
        BiConsumer<String, String> biConsumer1 = (s, s2) -> {
            if (s2.length() > 3) {
                map.put(s, s2);
            }
        };
        biConsumer1.accept("k1", "value very very long");
        biConsumer1.accept("k2", "va");
        biConsumer1.accept("k2", "pro");
        System.out.println(map);

        // return opposite hairness cat
        System.out.println("\nUnaryOperator");
        UnaryOperator<Cat> unaryOperator = s -> {
            for (Object o : s.getView()) {
                if (o instanceof BaldCat) {
                    return new Cat("newHairyCat", hairyCatFactory, Color.NONE);
                }
            }
            return new Cat(" newBaldyCat", baldCatFactory, Color.NONE);
        };
        System.out.println(unaryOperator.apply(brownBaldyCat));
        System.out.println(unaryOperator.apply(brownHairyCat));


        System.out.println("\nBinaryOperator");
        BinaryOperator<Cat> binaryOperator = Cat::fight;
        System.out.println("Winner cat is: " + binaryOperator.apply(brownBaldyCat, brownHairyCat));

        System.out.println("\nPredicate");
        Predicate<Cat> predicate = cat -> cat.getName().contains("Barsik");
        System.out.println(predicate.test(brownBaldyCat));
        System.out.println(predicate.test(brownHairyCat));
        System.out.println(predicate.test(defaultHairyCat));

        System.out.println("\nBiPredicate");
        BiPredicate<Cat, Cat> biPredicate = Cat::equals;
        System.out.println(biPredicate.test(brownBaldyCat, brownBaldyCat));
        System.out.println(biPredicate.test(brownHairyCat,defaultHairyCat));

    }
}

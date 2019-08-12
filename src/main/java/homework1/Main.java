package homework1;

import java.util.function.*;

/**
 * Implementation functional interfaces use Java 8
 *
 * @author Ilia Ugriumov
 */
public class Main {
    public static void main(String[] args) {
        Cat barsik = createCat ( "Barsik", 5, "black" );

        Consumer<Cat> consumer = c -> c.setName ( "Yuki" );
        consumer.accept ( barsik );
        System.out.println ( "Cat Barsik changed name. Now it is " + barsik );

        BiConsumer<Cat, String> biConsumer = (c, s) -> c.setName ( s );
        biConsumer.accept ( barsik, "Ryska" );
        System.out.println ( "Cat Barsik aka Ryska changed name. Now it is " + barsik );

        Function<Cat, String> function = s -> s.setVoice ( "Mayu" );
        System.out.println ( "We set new voice to Barsik aka Ryska = " + function.apply ( barsik ) );

        BiFunction<String, String, Cat> biFunction = (s1, s2) -> createCat ( s1, null, s2 );
        System.out.println ( "We created new Cat : " + biFunction.apply ( "Tori", "Gray" ) );

        UnaryOperator<Cat> unaryOperator = s -> s.doNametoUpperCase ();
        System.out.println ( "Cat name is upper Case = " + unaryOperator.apply ( barsik ) );

        BinaryOperator<StringBuilder> binaryOperator = (s1, s2) -> s1.append ( s2 ).reverse ();
        System.out.println ( binaryOperator.apply ( new StringBuilder ( "Hello" ), new StringBuilder ( "World" ) ) );

        Predicate<Cat> predicate = s -> s.isHungry ();
        System.out.println ( predicate.test ( barsik ) );

        BiPredicate<Cat, Cat> biPredicate = (c1, c2) -> c1.equals ( c2 );
        System.out.println ( "Is both cats equals? " + biPredicate.test ( barsik, createCat ( "Murzik", null, "Yellow" ) ) );

        Supplier<String> supplier = () -> "I was tired";
        System.out.println ( supplier.get () );
    }

    /**
     * method which creates cats
     *
     * @param name  - cat name
     * @param age   - cat age
     * @param color - cat color
     * @return if age == null return cat with random age. If age != null return cat with age use constructor
     */
    public static Cat createCat(String name, Integer age, String color) {
        Cat cat = null;
        if (age == null) {
            return cat = new Cat ( name, color );
        } else if (age != null) {
            return cat = new Cat ( name, age, color );
        } else {
            throw new IllegalArgumentException ();
        }
    }
}

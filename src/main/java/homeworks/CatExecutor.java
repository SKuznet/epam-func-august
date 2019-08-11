package homeworks;

import java.util.function.*;

public class CatExecutor {
    public static void main(String[] args) {
        CatFabric fabric = new CatFabric();
        Cat murzik = fabric.create("Murzik", "Male", 4);
        Cat barsik = fabric.create("Barsik", "Male", 7);
        Cat riska = fabric.create("Riska", "Female", 5);

        printInfo(barsik);

        System.out.println(isFamily(murzik, barsik));
        System.out.println(isFamily(murzik, riska));
    }

    public static void printInfo(Cat cat){
        System.out.println("\nConsumer method");
        Consumer<Cat> consumer = System.out::println;
        consumer.accept(cat);
    }


    public static Integer increaseAge(Cat cat){
        System.out.println("\nUnaryOperator method");
        UnaryOperator<Integer> unaryOperator = (age) -> age++;
        return unaryOperator.apply(cat.getAge());
    }

    public static StringBuilder setStatus(Cat cat, StringBuilder status){
        System.out.println("\nBinaryOperator method");
        StringBuilder result = new StringBuilder(cat.getName()+"'s ");
        BinaryOperator<StringBuilder> binaryOperator = (a, b) -> a.append(b);
        return binaryOperator.apply(result, status);
    }

    public static StringBuilder isFamily (Cat cat, Cat kitty){
        System.out.println("\nBiPredicate method");
        StringBuilder result = new StringBuilder(cat.getName() + " and " + kitty.getName() + " is a family: ");
        BiPredicate<String, String> biPredicate = ((catSex1, catSex2) -> catSex1 != catSex2);
        result.append(biPredicate.test(cat.getSex(), kitty.getSex()));
        return result;
    }

//    consumer; +
//    function
//    biFunction;
//    UnaryOperator; +
//    BinaryOperator; +
//    predicate;
//    bipredicate +
//
}

package homework1;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        FabricOfCat<Cat> fabricOfCat = () -> new Cat();
        Supplier<Cat> supplier = () -> fabricOfCat.createCate();
        Cat cat = supplier.get();
        BiConsumer<String, Boolean> biConsumer = (name, isHungry) -> {
            cat.setName(name);
            cat.setHungry(isHungry);
        };
        biConsumer.accept("Barsik", true);
        Consumer<Boolean> consumer = isHerbivore -> cat.setHerbivore(isHerbivore);
        consumer.accept(true);
        Predicate<Cat> predicate = x -> x.isHungry();
        if (predicate.test(cat)) {
            System.out.println(cat);
        }
        UnaryOperator<StringBuilder> unaryOperator = x -> x.reverse();
        BinaryOperator<StringBuilder> binaryOperator = (sb1, sb2) -> sb1.append(sb2);
    }
}

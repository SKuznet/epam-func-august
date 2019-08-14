package lesson3.hw;

import lesson3.hw.cats.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.function.*;

public class Tests {

    static Predicate<Cat> predicate;
    static BiPredicate<Cat, Cat> biPredicate;
    static BinaryOperator<Cat> binaryOperator;
    static UnaryOperator<Cat> unaryOperator;
    static Function<Cat, String> function;
    static BiFunction<Cat,Cat, String> biFunction;
    static Consumer<Cat> consumer;
    static BiConsumer<Cat, Cat> biConsumer;
    static Supplier<String> supplier;


    static Cat barsik;
    static Cat mursik;

    @BeforeClass
    public static void setupLambdas() {
        predicate = x -> x.getName().equals("Barsik");
        biPredicate = (x, y) -> x.getName().equals(y.getName());
        binaryOperator = (x, y) -> {
            x.setAge(y.getAge());
            return x;
        };
        unaryOperator = x -> {
            x.setAge(1);
            return x;
        };
        function = x -> x.isHerbivore() ? "Yes" : "No";
        biFunction = (x, y) -> (x.isHerbivore() & y.isHerbivore()) ? "Yes": "No";
        consumer = x -> x.setHerbivore(false);
        biConsumer = (x, y) -> x.setAge(y.getAge());
        supplier = () -> barsik.getName();
    }

    @Before
    public void initCats() {
        barsik = CatFactory.createCat("Barsik");
        mursik = CatFactory.createCat("Mursik");
    }

    @Test
    public void testPredicate() {
        Assert.assertTrue(predicate.test(barsik));
    }

    @Test
    public void testBiPredicate() {
        Assert.assertFalse(biPredicate.test(barsik, mursik));
    }

    @Test
    public void testBinaryOperator() {
        Assert.assertEquals(binaryOperator.apply(barsik, mursik).getAge(), 2);
    }

    @Test
    public void testUnaryOperator() {
        Assert.assertEquals(unaryOperator.apply(barsik).getAge(), 1);
    }

    @Test
    public void testFunction() {
        Assert.assertEquals(function.apply(barsik), "No");
    }

    @Test
    public void testBiFunction() {
        Assert.assertEquals(biFunction.apply(barsik, mursik), "No");
    }

    @Test
    public void testConsumer() {
        consumer.accept(barsik);
        Assert.assertFalse(barsik.isHerbivore());
    }

    @Test
    public void testBiConsumer() {
        biConsumer.accept(barsik, mursik);
        Assert.assertEquals(barsik.getAge(), mursik.getAge());
    }

    @Test
    public void testSupplier() {
        Assert.assertEquals(supplier.get(), "Barsik");
    }

}

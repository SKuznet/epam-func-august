package homework1;

import java.awt.*;
import java.util.Objects;
import java.util.function.*;

/**
 * CatFunc shows functional interfaces with lambda logic
 */
public class CatFunc {
    private String name;
    private int weight;
    private boolean isHungry;

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    private boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    /**
     * Returns composed names
     */
    String getTwoNames(CatFunc cat) {
        return this.name.concat(" & " + cat.getName());
    }

    /**
     * Returns new CatFunc object with uppercase name
     */
    CatFunc upperCaseNameCat() {
        CatFunc cat = CatFactory.createCat(this.name.toUpperCase(), this.weight);
        return cat;
    }

    /**
     * Creates new CatFunc object that has composed weight parameter
     */
    CatFunc motherCat(CatFunc catFunc) {
        CatFunc cat = CatFactory.createCat("MotherCAT", this.weight + catFunc.weight + 50);
        return cat;
    }

    /**
     * Checks if name field not null
     */
    private boolean hasName() {
        return this.name != null;
    }

    /**
     * Returns Cat color
     * */
    private Color getCatColor() {
        if (this.name.equals("Snezhok")) return Color.WHITE;
        else return Color.BLACK;
    }

    /**
     * Returns color of heavier cat
     * */
    private Color getHeaviestCatColor(CatFunc catFunc) {
        if (this.weight > catFunc.weight) return getCatColor();
        else return catFunc.getCatColor();
    }

    /**
     * Check cat for checking boolean parameter
     * */
    private static void checkCat(CatFunc cat, CheckCat checkCat) {
        if (checkCat.check(cat)) {
            System.out.println(cat + "\n");
        }
    }

    /**
     * This is bad practice!
     * Printing of cat weight
     * */
    private static void printWeight(CatFunc cat, GetWeight get) {
        System.out.println(get.get(cat));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatFunc catFunc = (CatFunc) o;
        return weight == catFunc.weight &&
                name.equals(catFunc.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "CatFunc{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", isHungry=" + isHungry +
                '}';
    }

    public static void main(String[] args) {
        CatFunc catOne = CatFactory.createCat("Barsik", 10);
        CatFunc catTwo = CatFactory.createCat("Snezhok", 200);
        CatFunc catNoName = CatFactory.createCat(5);
        CatFunc catThree = CatFactory.createCat("Tom", 5, true);

        Function<CatFunc, Color> function = f -> f.getCatColor();
        System.out.println(function.apply(catOne));
        System.out.println(function.apply(catTwo) + "\n");

        BiFunction<CatFunc, CatFunc, Color> biFunction = (f1, f2) -> f1.getHeaviestCatColor(f2);
        System.out.println(biFunction.apply(catOne, catTwo) + "\n");

        Consumer<CatFunc> consumer = c -> System.out.println(c.getName() + "\n");
        consumer.accept(catOne);

        BiConsumer<CatFunc, CatFunc> biConsumer = (c1, c2) -> System.out.println(c1.getTwoNames(c2) + "\n");
        biConsumer.accept(catOne, catTwo);

        UnaryOperator<CatFunc> unaryOperator = u -> u.upperCaseNameCat();
        System.out.println(unaryOperator.apply(catOne).name + "\n");

        BinaryOperator<CatFunc> binaryOperator = (b1, b2) -> b1.motherCat(b2);
        System.out.println(binaryOperator.apply(catOne, catTwo).name + "\n");

        Predicate<CatFunc> predicate = p -> p.hasName();
        System.out.println(predicate.test(catOne));
        System.out.println(predicate.test(catNoName) + "\n");

        BiPredicate<CatFunc, CatFunc> biPredicate = (b1, b2) -> b1.equals(b2);
        System.out.println(biPredicate.test(catOne, catOne));
        System.out.println(biPredicate.test(catOne, catTwo) + "\n");

        Supplier<CatFunc> supplier = () -> catOne;
        System.out.println(supplier.get() + "\n");

        checkCat(catThree, c -> c.isHungry());
        printWeight(catThree, c -> c.getWeight());
    }

    /**
     * CatFactory implements Factory pattern
     */
    static class CatFactory {
        static CatFunc createCat(int weight) {
            CatFunc cat = new CatFunc();
            cat.name = null;
            cat.weight = weight;
            return cat;
        }

        static CatFunc createCat(String name, int weight) {
            CatFunc cat = new CatFunc();
            cat.name = name;
            cat.weight = weight;
            return cat;
        }

        static CatFunc createCat(String name, int weight, boolean isHungry) {
            CatFunc cat = new CatFunc();
            cat.name = name;
            cat.weight = weight;
            cat.isHungry = isHungry;
            return cat;
        }
    }

    @FunctionalInterface
    interface CheckCat {
        boolean check(CatFunc cat);
    }

    @FunctionalInterface
    interface GetWeight {
        int get(CatFunc cat);
    }
}

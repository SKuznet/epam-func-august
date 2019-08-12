package homeworks.hw1;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer<Cat> consumer = C -> C.tellAboutYourself();
        consumer.accept(CatFactory.getCat("Barsik", Breed.MUNCHKIN));

        Function<String, Cat> function = C -> CatFactory.getCat(C);
        function.apply("Ershik").tellAboutYourself();

        UnaryOperator<Cat> operator = C -> CatFactory.getCat(C.getName());
        operator.apply(CatFactory.getCat("Murzik", Breed.BRITISH)).tellAboutYourself();

        Predicate<Cat> predicate = C -> C.isBiggest();
        System.out.println(predicate.test(CatFactory.getCat("True", Breed.MAINE_COON)));

        Supplier<Cat> supplier = () -> CatFactory.getCat("Guy Fox", Breed.BRITISH);
        supplier.get().tellAboutYourself();
    }

}

package javaeighttest;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = String::new;
        Supplier<Integer> integerSupplier = () -> 1;
        Supplier<StringBuilder> stringBuilderSupplier = () -> new StringBuilder("well done");

        String s = stringSupplier.get();
        int i = integerSupplier.get();
        StringBuilder stringBuilder = stringBuilderSupplier.get();
        System.out.println(stringBuilder);
    }
}

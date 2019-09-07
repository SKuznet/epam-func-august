package javaeighttest;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {

    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator = String::new;
        System.out.println(stringUnaryOperator.apply("5"));
        UnaryOperator<String> stringUnaryOperator1 = String::toUpperCase;
        System.out.println(stringUnaryOperator1.apply("Hello"));

        BinaryOperator<String> stringBinaryOperator = (s, s2) -> s.concat(s2 + "!");
        System.out.println(stringBinaryOperator.apply("Hel", "lo"));
    }
}

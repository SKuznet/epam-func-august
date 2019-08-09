package lesson3;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {
    public static void main(String[] args) {
        //Фантазии совсем нет, повторяю
        UnaryOperator<StringBuilder> unaryOperator = sb -> sb.reverse();
        BinaryOperator<StringBuilder> binaryOperator = (sb, sb1) -> sb1.reverse().append(sb);

        System.out.println(unaryOperator.apply(new StringBuilder("Java")));
        System.out.println(binaryOperator.apply(new StringBuilder("java 8"), new StringBuilder("java 8")));

    }
}

package lesson3.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {

  public static void main(String[] args) {
    UnaryOperator<StringBuilder> unaryOperator = sb -> sb.reverse();
    BinaryOperator<StringBuilder> binaryOperator = (sb1, sb2) -> sb1.append(sb2);

    System.out.println(unaryOperator.apply(new StringBuilder("Functional interface java 8")));

    System.out.println(binaryOperator
        .apply(new StringBuilder("Functional interface"), new StringBuilder(" java8")));
  }
}

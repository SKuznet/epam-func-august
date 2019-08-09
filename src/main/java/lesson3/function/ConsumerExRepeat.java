package lesson3.function;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class ConsumerExRepeat {

  public static void main(String[] args) {
    ArrayList<Integer> happyDays = new ArrayList<>();
    BiConsumer<Integer, Integer> biConsumer = (i1, i2) -> happyDays.add(i1, i2);
    biConsumer.accept(0, 25);
    biConsumer.accept(1, 31);
    biConsumer.accept(2, 10);
    System.out.println(happyDays);
  }
}

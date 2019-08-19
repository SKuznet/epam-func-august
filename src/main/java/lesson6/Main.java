package lesson6;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //old realization
    List<Integer> list = Arrays.asList(1, 2, 5, 9, 22);

    Integer summaryOddOldResult = 0;

    for (Integer i : list) {
      if (i % 2 != 0) {
        summaryOddOldResult += i;
      }
    }

    System.out.println(summaryOddOldResult);

    Integer summeryOddResultWithStream = list.stream()
        .filter(o -> o % 2 != 0)
        .reduce((s1, s2) -> s1 + s2).orElse(0);

    System.out.println(summeryOddResultWithStream);

    Integer summaryOddResultWithParallelStream = list.parallelStream()
        .filter(o -> o % 2 != 0)
        .reduce((s1, s2) -> s1 + s2).orElse(0);

    System.out.println(summaryOddResultWithParallelStream);

  }
}

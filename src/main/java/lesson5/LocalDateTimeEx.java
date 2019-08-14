package lesson5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public class LocalDateTimeEx {

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);
    dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    System.out.println(dateTime);

    LocalDateTime dateTime1 = LocalDateTime.of(2017, Month.APRIL, 9, 11, 6, 12);
    System.out.println(dateTime1);

    LocalDateTime dateTime2 = LocalDateTime.ofEpochSecond(2000, 12, ZoneOffset.UTC);
    System.out.println(dateTime2);

    Duration sixtyDays = Duration.ofDays(2);
    System.out.println(sixtyDays.toMinutes());
  }

}

package lesson5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateEx {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);

    Instant timestamp = Instant.now();
    System.out.println(timestamp);
    Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
    System.out.println(specificTime);

    LocalDate specific = LocalDate.of(2017, Month.APRIL, 30);
    System.out.println(specific);

//    LocalDate invDate = LocalDate.of(2017,Month.APRIL,33);
//    System.out.println(invDate);

    LocalDate dateFromBegin = LocalDate.ofEpochDay(365);
    System.out.println(dateFromBegin);

    LocalDate dateByDay = LocalDate.ofYearDay(2014,259);
    System.out.println(dateByDay);

  }


}

package lesson5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateEx {
    public static void main(String[] args) {
        //sql.Date
        //util.Date
        //Joda.Time

        LocalDate today = LocalDate.now();
        System.out.println(today);

        Instant timestamp = Instant.now();
        System.out.println(timestamp);

        Instant specificTIme = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println(specificTIme);

        LocalDate specific = LocalDate.of(2017, Month.APRIL,18);
        System.out.println(specific);

        LocalDate dateFromBegin = LocalDate.ofEpochDay(365);
        System.out.println(dateFromBegin);
    }
}

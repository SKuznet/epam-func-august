package lesson5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        //sql.Date
        //util.Date
        //Joda.Time

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specific = LocalDate.of(2017, Month.APRIL, 30);
        System.out.println(specific);

        //LocalDate invData = LocalDate.of(2017, Month.APRIL, 33);
        //System.out.println(invData);

        LocalDate dateFromBegin = LocalDate.ofEpochDay(365);
        System.out.println(dateFromBegin);

        LocalDate special = LocalDate.of(2016, Month.FEBRUARY, 29);
        System.out.println(special);

        LocalDate dateByDay = LocalDate.ofYearDay(2014, 259);
        System.out.println(dateByDay);

    }
}

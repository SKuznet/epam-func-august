package lesson5;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateEx {
    public static void main(String[] args) {
        // sql.Date
        // util.Date
        // Joda.Time

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specific = LocalDate.of(2016, Month.FEBRUARY, 29);
        System.out.println(specific);

//        LocalDate invDate = LocalDate.of(2017, Month.APRIL, 31);
//        System.out.println(invDate);

        LocalDate dateFromBegin = LocalDate.ofEpochDay(365);
        System.out.println(dateFromBegin);

        LocalDate dateByDay = LocalDate.ofYearDay(2014, 259);
        System.out.println(dateByDay);
    }
}

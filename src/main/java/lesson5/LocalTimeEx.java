package lesson5;

import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime specificTimr = LocalTime.of(23,15,12,221);
        System.out.println(specificTimr);

        LocalTime sec2000 = LocalTime.ofSecondOfDay(2000);
        System.out.println(sec2000);
    }
}

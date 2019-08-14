package lesson5;

import java.time.Instant;
import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {
        Instant timeStamp = Instant.now();
        System.out.println(timeStamp);

        Instant specificTime = Instant.ofEpochMilli(timeStamp.toEpochMilli());
        System.out.println(specificTime);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime specificTimeE = LocalTime.of(23,15,12,221);
        System.out.println(specificTimeE);

    }
}

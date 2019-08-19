package lesson5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime);

        Duration twoDays = Duration.ofDays(2);
        System.out.println(twoDays.toMinutes());
    }
}

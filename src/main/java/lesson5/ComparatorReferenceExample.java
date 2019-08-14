package lesson5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorReferenceExample {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Nick", "Ball"));
        list.add(new User("Tom", "Soyer"));
        list.add(new User("Jack", "Sparrow"));
        list.add(new User("Barsik", "The great"));
        list.add(new User("Ara", "Bird1"));
        list.add(new User("Ara", "Bird2"));
        list.add(new User("Ara", "Bird3"));

        System.out.println("Sort by name");
        list.sort(Comparator.comparing(User::toString));
        list.forEach(System.out::println);
    }
}

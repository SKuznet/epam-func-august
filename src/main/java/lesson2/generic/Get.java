package lesson2.generic;

@FunctionalInterface
public interface Get<T> {
  T get(Horse horse);

}

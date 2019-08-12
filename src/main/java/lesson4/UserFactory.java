package lesson4;

@FunctionalInterface
public interface UserFactory {

  User createUser(String name, String description);
}

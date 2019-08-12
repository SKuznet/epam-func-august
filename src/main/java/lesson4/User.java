package lesson4;

public class User {

  String name;
  String description;

  public User(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}

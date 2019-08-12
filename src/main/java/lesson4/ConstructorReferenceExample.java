package lesson4;

public class ConstructorReferenceExample {

  public static void main(String[] args) {
    UserFactory userFactory = User::new;
    User user = userFactory.createUser("John", "Whick");
    System.out.println(user);
  }
}

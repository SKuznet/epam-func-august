package lesson4;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        User user = userFactory.createUser("John", "Snow");
        System.out.println(user);

    }

    private short getSum(short a, short b) {
        return (short) (a + b);
    }
}

interface UserFactory {
    User createUser(String name, String description);
}


class User {
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
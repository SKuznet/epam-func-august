package lesson4;

interface UserFactory {
    User createUser(String name, String secription);
}

interface UserFactory2 {
    User createUser(String name);
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        UserFactory2 userFactory2 = User::new;
        User user = userFactory.createUser("John", "snow");
        User user1 = userFactory2.createUser("John");

        System.out.println(user);
    }

    private short getSum(short a, short b) {
        return (short) (a + b);
    }
}

class User {
    String name;
    String description;

    public User(String name) {
        this.name = name;
    }

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

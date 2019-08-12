package lesson4;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
interface construct {
    User constr(String name);
}

class User {
    String name;

    User(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Function<String,String> action = String::trim;
        String result = action.andThen(String::toLowerCase).andThen(StringBuilder::new).andThen(StringBuilder::toString)
                .apply("fkdjlkj");
        System.out.println(result);
        construct construct1 = User::new;

        User user = construct1.constr("sdf");
        System.out.println(user.name);
        action(100, 200, func::min);
        action(100,200,(a,b)->a-b);
    }

    private static void action(int a, int b, MyFunc act) {
        System.out.println(act.operation(a, b));
    }
}

@FunctionalInterface
interface MyFunc {
    int operation(int a, int b);
}

class func {
    static int min(int a, int b) {
        return a - b;
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
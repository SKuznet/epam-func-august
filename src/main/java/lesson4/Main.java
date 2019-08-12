package lesson4;

public class Main {
    public static void main(String[] args) {
        int val1 = 100;
        int val2 = 30;
        int result = action(val1, val2, MyMathUtil::minus);
        System.out.println(result);
        int result2 = action(val1, val2, MyMathUtil::sum);
        System.out.println(result2);
        int result3 = action(val1, val2, Math::min);
        System.out.println(result3);
    }

    public static int action(int val1, int val2, MyFunction myFunction) {
        return myFunction.doSomething(val1, val2);
    }
}

@FunctionalInterface
interface MyFunction {
    int doSomething(int val1, int val2);
}

class MyMathUtil {
    public static int sum(int val1, int val2) {
        return val1 + val2;
    }

    public static int minus(int val1, int val2) {
        return val1 - val2;
    }
}

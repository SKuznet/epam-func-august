package lesson2;

@FunctionalInterface
public interface InterfaceEx3 extends FunctionalInterfaceExample {
    default void getMoney() {
        System.out.println("Who am I?");
    }

    static void getInfo() {

    }
}

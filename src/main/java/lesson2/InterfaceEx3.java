package lesson2;

public interface InterfaceEx3 extends FunctionalInterfaceExample {
    default void getMoney() {
        System.out.println("Money");
    }
}

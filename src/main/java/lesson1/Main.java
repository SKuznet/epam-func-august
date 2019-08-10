package lesson1;

public class Main {
    //test
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("I am from another thread!");
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("I am from another thread!"));
        thread1.start();
    }
}

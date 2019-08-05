package lesson1;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from another Thread!");
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("I am from another Thread!"));
        thread.start();

    }
}

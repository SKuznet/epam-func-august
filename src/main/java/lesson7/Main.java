package lesson7;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hi with ForkJoinPool" + Thread.currentThread().getName());

        try {
            System.out.println(Thread.currentThread().getName());
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hi with new CashedThreadPool" + Thread.currentThread().getName(), Executors.newCachedThreadPool());

        try {
            System.out.println(future1.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("I will work from another thread" + Thread.currentThread().getName());
        });

        try {
            future2.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        Executor executor = Executors.newFixedThreadPool(10);

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "result asynch job";
        }, executor);

        try {
            System.out.println(future3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

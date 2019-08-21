package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) {
    CompletableFuture<String> future = CompletableFuture
        .supplyAsync(() -> "Hi with ForkJoinPool" + Thread.currentThread().getName());

    try {
      System.out.println(Thread.currentThread().getName());
      System.out.println(future.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    CompletableFuture<String> future2 = CompletableFuture
        .supplyAsync(() -> "Hi with newCashedThreadPool",
            Executors.newCachedThreadPool());

    try {
      System.out.println(future2.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    CompletableFuture<Void> future3 = CompletableFuture.runAsync(() -> {
      try {
        TimeUnit.MILLISECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("I willl work from another thread" + Thread.currentThread().getName());
    });

    try {
      future3.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    Executor executor = Executors.newFixedThreadPool(10);
    CompletableFuture<String> future5 = CompletableFuture.supplyAsync(() -> {
      try {
        TimeUnit.MILLISECONDS.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "result async job";
    }, executor);

    try {
      System.out.println(future.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

  }

}

package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture3 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hi");

        future.thenApply(result -> {
            result = result.toUpperCase();
            System.out.println(result + " :)");
            return result;
        });

        future.thenApply(result -> {
            System.out.println(result + " <3");
            return result;
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

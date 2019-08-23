package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BlockedFuture {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();

        try {
            String result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

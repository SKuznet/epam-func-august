package lesson7;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture4 {
    public static void main(String[] args) {
        int productId = 5;

        CompletableFuture.supplyAsync(() -> {
            return ProductService.getProdutDetail(productId);
        }).thenAccept(product -> {
            System.out.println("Get intfo: " + product.toUpperCase());
        });

        CompletableFuture.supplyAsync(() -> {
            System.out.println("Do something...");
            return productId + 5;
        }).thenRun(() -> System.out.println("done"));
    }

    static class ProductService {
        static String getProdutDetail(int id) {
            return "product " + id;
        }
    }
}

package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class CompFuture4 {

  public static void main(String[] args) {
    int productId = 5;

    CompletableFuture.supplyAsync(()-> {
      return ProductService.getProductDetail(productId);
    }).thenAccept(product -> System.out.println("Get info about product "+ product.toUpperCase()));

//    CompletableFuture.supplyAsync(() -> {
//      System.out.println("Do something...");
//      return productId + 5;
//    }).thenRun(() -> )

  }

  static class ProductService {
    static String getProductDetail (int id){
      return "product" + id;
    }
  }
}
